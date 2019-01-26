package tarr.app.ver2;

import tarr.app.ver1.AbstractTask;

import java.time.LocalDate;

interface Todoable {

boolean addTask(AbstractTask t);
void deleteTask (int i) throws IndexOutOfBoundsException;
String getAsString(int i);
AbstractTask getTask(int i) throws AbsentTaskException;
int size();

boolean contains(LocalDate obj);

void removeDone();
}
