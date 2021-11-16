package club.deltapvp.punishments.api;

import club.deltapvp.punishments.api.structure.Note;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public interface NoteManager {

    void createNote(String message, UUID addedBy);

    void deleteNote(UUID uuid, Note note);

    Optional<Note> getNote(UUID uuid, int id);

    ArrayList<Note> getNotes(UUID uuid);

}
