package club.deltapvp.punishments.api;

import club.deltapvp.punishments.api.structure.PersistentNote;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface NoteManager {

    /**
     * Create a Note
     * @param uuid Player's {@link UUID}
     * @param addedBy The user that added this note's {@link UUID}!
     * @param content Content of the Note
     */
    CompletableFuture<Void> createNote(@NotNull UUID uuid, @Nullable UUID addedBy, @NotNull String content);

    /**
     * Remove a Note
     * @param note Note to be removed
     */
    CompletableFuture<Void> removeNote(@NotNull PersistentNote note);

    /**
     * Remove a Note with the {@link Long} ID provided
     * @param id ID of the Note to be removed
     */
    CompletableFuture<Void> removeNote(long id);

    /**
     * Update a Note in the database
     * @param id ID of the Note
     * @param updateFunction Update Function of the Note
     */
    CompletableFuture<Void> updateNote(long id, @NotNull Consumer<PersistentNote> updateFunction);

    /**
     * Get a {@link Collection} of {@link PersistentNote} bound to a {@link UUID}
     * @param uuid {@link UUID}
     * @return {@link Collection} of {@link PersistentNote}
     */
    CompletableFuture<Collection<PersistentNote>> getNotes(@NotNull UUID uuid);

    /**
     * Get a {@link Collection} of {@link PersistentNote} bound to a {@link Player}
     * @param player {@link Player}
     * @return {@link Collection} of {@link PersistentNote}
     */
    CompletableFuture<Collection<PersistentNote>> getNotes(@NotNull Player player);

    /**
     * Get a {@link Collection} of {@link PersistentNote} bound to a {@link OfflinePlayer}
     * @param player {@link OfflinePlayer}
     * @return {@link Collection} of {@link PersistentNote}
     */
    CompletableFuture<Collection<PersistentNote>> getNotes(@NotNull OfflinePlayer player);

    /**
     * Get a {@link Collection} of all Notes
     */
    CompletableFuture<Collection<PersistentNote>> getNotes();

}
