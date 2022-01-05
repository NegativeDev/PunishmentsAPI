package club.deltapvp.punishments.api;

import club.deltapvp.punishments.api.structure.PersistentPunishment;
import club.deltapvp.punishments.api.structure.PunishmentType;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/**
 * Represents the Data Management class which
 * will be used to gather and manipulate punishments
 * across plugins.
 */
public interface PunishDataManager {

    /**
     * Get all punishments of a specified {@link PunishmentType}.
     * @param type {@link PunishmentType}
     * @return {@link Collection} of {@link PersistentPunishment}
     */
    CompletableFuture<Collection<PersistentPunishment>> getPunishments(@NotNull PunishmentType type);

    /**
     * Updates a Punishment in the database
     * @param id ID to the Punishment
     * @param updateFunction Code to be run before update
     */
    CompletableFuture<Void> updatePunishment(long id, @NotNull Consumer<PersistentPunishment> updateFunction);

    /**
     * Deletes the Punishment from the database
     * @param id ID of the Punishment
     */
    CompletableFuture<Void> deletePunishment(long id);

    /**
     * Deletes the Punishment from the database
     * @param punishment {@link PersistentPunishment}
     */
    CompletableFuture<Void> deletePunishment(@NotNull PersistentPunishment punishment);

    /**
     * Update the duration of the Punishment in the database
     * @param id ID of the Punishment
     * @param duration Duration of the Punishment in {@link Long}
     */
    CompletableFuture<Void> updateTime(long id, long duration);

    /**
     * Update the activity of the Punishment
     * @param id ID of the Punishment
     * @param active Will the Punishment be active?
     */
    CompletableFuture<Void> updateActive(long id, boolean active);
}
