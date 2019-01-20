package tarr.app.ver2;

import tarr.app.ver1.AbstractTask;

interface Todoable {

boolean addTask(AbstractTask t);
boolean deleteTask(int i);
String getAsString(int i);
AbstractTask getTask(int i);
int size();

}
