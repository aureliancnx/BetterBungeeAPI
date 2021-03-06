package fr.aureliancnx.betterbungee.api.manager;

import fr.aureliancnx.betterbungee.api.IBungeePing;
import fr.aureliancnx.betterbungee.api.bungee.IBungeeServer;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

public interface IBungeeManager {

    /**
     * Get bungeecord server by name.
     * If the bungeecord name is the current running bungeecord,
     * it returns the exact instance of MyProxy
     * @param name bungee name (case insensitive)
     * @return IBungeeServer
     */
    IBungeeServer getBungee(final String name);

    /**
     * Get all bungee server objects
     * @return a collection of IBungeeServer
     */
    Collection<IBungeeServer> getBungees();

    /**
     * Creates an iterator of entries with, accordingly,
     * the bungee name and the instance of IBungeeServer.
     * @return iterator
     */
    Iterator<Map.Entry<String, IBungeeServer>> iterator();

    /**
     * Get all bungeecord objects that matches a
     * specific predicate, provided in argument.
     * @param predicate predicate of IBungeeServer
     * @return a collection of IBungeeServer
     */
    Collection<IBungeeServer> getBungees(Predicate<IBungeeServer> predicate);

    /**
     * Add a bungee in the bungee manager by using
     * the bungee ping packet
     * @param bungeePing PacketBungeePing
     * @return Bungee server instance
     */
    IBungeeServer addBungee(final IBungeePing bungeePing);

    /**
     * Removes a bungeecord from the bungee manager
     * by using the bungee name
     * @param bungeeName exact bungee name (case insensitive)
     * @return removed bungee server instance or null if unknown
     */
    IBungeeServer removeBungee(final String bungeeName);

    /**
     * Updates bungeecord information (such as player data)
     * by using the ping packet
     * @param pingPacket PacketBungeePing
     * @return Updated or newly created bungee server
     */
    IBungeeServer updateBungee(final IBungeePing pingPacket);

    /**
     * Get current bungee server
     * @return MyBungee
     */
    IBungeeServer getMy();


}
