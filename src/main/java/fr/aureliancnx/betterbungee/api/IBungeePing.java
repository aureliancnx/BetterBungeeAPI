package fr.aureliancnx.betterbungee.api;

import fr.aureliancnx.betterbungee.api.player.IBetterPlayer;

import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

public interface IBungeePing {

    /**
     * Get bungeecord name from ping
     * @return name
     */
    String getName();

    /**
     * Get bungeecord slots from ping
     * @return slots
     */
    int getSlots();

    /**
     * Get bungeecord player list from ping
     * @return map of players
     */
    ConcurrentMap<UUID, IBetterPlayer> getPlayers();

}
