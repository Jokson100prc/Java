
import java.time.LocalDate;
import java.util.*;

abstract class AbstractField<T>{
  private String name;
  private T type;
  private boolean canRead;
  private boolean canWrite;
  private boolean visible;

  public AbstractField(String name, T type){
    this.type = type;
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public T getType(){
    return type;
  }
}

interface Enumerable{
  Map<String, AbstractField> values();

  default void addValue(AbstractField o){
    values().put(o.getName(), o);
  }

  default AbstractField ofValue(String name){
    if (values().containsKey(name)){
      return values().get(name);
    }
    return null;
  }

  default void print(){
    for(AbstractField f: values().values()){
      System.out.println(f.getName() +" "+ f.getType());
    }
  }
}
class CountryFields<T> extends AbstractField<T> implements  Enumerable{
  static final CountryFields<Integer> ID = new CountryFields<>("ID", 0);
  static final CountryFields<String> NAME = new CountryFields<>("NAME", "");
  static final CountryFields<Entity> CAPITAL = new CountryFields<Entity>("CAPITAL", new Entity<CityFields>());

  public CountryFields(String name, T type) {
    super(name, type);
    addValue(this);
  }

  @Override
  public Map<String, AbstractField> values() {
    return null;
  }
}

class CityFields<T> extends AbstractField<T> implements Enumerable{

  static final CityFields<Integer> GEO_NAME_ID= new CityFields("GEO_NAME_ID",1);
  static final CityFields<String>  NAME = new CityFields("NAME", "none");
  static final CityFields<String>  ASCII_NAME = new CityFields("ASCII_NAME","none");
  static final CityFields<String>  ALTERNATIVE_NAME = new CityFields("ALTERNATIVE_NAME","none");

  static Map<String, AbstractField> values;

  private CityFields(String name, T defaultValue){
    super(name, defaultValue);
    addValue(this);
  }

  public Map<String, AbstractField> values(){
    if (values == null){
      values = new HashMap<>();
    }
    return values;
  }

  static void printFields(){
    for(AbstractField f: values.values()){
      CityFields cf = (CityFields) f;
      System.out.println(cf.getName());
    }
  }

  static public CityFields valueOf(String name){
    return (CityFields) values.get(name);
  }
}

class Value<T extends AbstractField, V> {
  private V value;
  private T column;

  public Value(V value, T field) throws Exception {
    if (value == null || isType(value, field) ) {
      this.value = value;
      this.column = field;
    } else{
      throw new Exception("Invalid type value");
    }
  }

  public V getValue(){
    return value;
  }

  private boolean isType(V value, T field) throws Exception {
    if (value == null) {
      throw new Exception("Value cannot be null");
    }
    return field.getType().getClass().isInstance(value);
  }

  public T getField() {
    return column;
  }
}

class Entity<T extends AbstractField & Enumerable> {
  private Map<String, Value> values;
  public Entity(){
    values = new HashMap<>();
  }

  public void setValue(Value<T, ?> value){
    if (value != null)
      values.put(value.getField().getName(), value);
  }

  public Object getValue(T field){
    if (values.containsKey(field.getName()))
      return values.get(field.getName()).getValue();
    return null;
  }

  public void printValues(){
    for (Value v: values.values()){
      System.out.println(v.getValue());
    }
  }
  @Override
  public String toString(){
    StringBuilder b = new StringBuilder();
    for (Value v: values.values()){
      System.out.println(v.getValue());
      b.append(v.getField().getName() + ": " + v.getValue() +", ");
    }
    return b.append("\b\b").toString();
  }

  public String toStringValues(){
    StringBuilder b = new StringBuilder();
    for (Value v: values.values()){
      b.append(v.getField().getName()+"\t");
    }
    return b.append("\b\b").toString();
  }
}


class City{
  int geoNameId;
  String name;
  String asciiName;
  String alternateNames;
  double latitutude;
  double longitude;
  String featureClass;
  String featureCode;
  String countryCode;
  String cc2;
  String admin1Code;
  String admin2Code;
  String admin3Code;
  String admin4Code;
  long population;
  int elevation;
  int dem;
  String timeZone;
  LocalDate modificationDate;

  public City(String row){
    String[] fields = row.split("\t");
  }
}

public class Task {
  public static void main(String[] args) throws Exception {
    CityFields.printFields();
    System.out.println(CityFields.valueOf("NAME"));
    Entity<CityFields> city = new Entity<>();
    city.setValue(new Value<CityFields, String>("WARSAW", CityFields.NAME));
    city.setValue(new Value<CityFields, Integer>(1, CityFields.GEO_NAME_ID));
    System.out.println(city);
    Entity<CountryFields> poland = new Entity<>();
    poland.setValue(new Value<>("POLAND", CountryFields.NAME));
    poland.setValue(new Value<>(1,CountryFields.ID));
    //poland.setValue(new Value<CountryFields, Entity>(city, CountryFields.CAPITAL));
    System.out.println(poland);

  }
}