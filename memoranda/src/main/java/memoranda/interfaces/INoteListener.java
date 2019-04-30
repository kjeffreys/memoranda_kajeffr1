package main.java.memoranda.interfaces;

public interface INoteListener {
  void noteChange(Note note, boolean toSaveCurrentNote);
}