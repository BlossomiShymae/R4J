package no.stelar7.api.l4j8.impl;

import no.stelar7.api.l4j8.basic.constants.api.*;
import no.stelar7.api.l4j8.basic.constants.types.*;
import no.stelar7.api.l4j8.pojo.staticdata.champion.*;
import no.stelar7.api.l4j8.pojo.staticdata.item.Item;
import no.stelar7.api.l4j8.pojo.staticdata.mastery.StaticMastery;
import no.stelar7.api.l4j8.pojo.staticdata.realm.Realm;
import no.stelar7.api.l4j8.pojo.staticdata.rune.StaticRune;

public final class ImageAPI
{
    private static final ImageAPI INSTANCE = new ImageAPI();
    
    public static ImageAPI getInstance()
    {
        return ImageAPI.INSTANCE;
    }
    
    private ImageAPI()
    {
        // Hide public constructor
    }
    
    
    /**
     * Gets profile icon.
     *
     * @param iconid  the iconid
     * @param version the version
     * @return the profile icon
     */
    public String getProfileIcon(String iconid, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/profileicon";
        
        //http://ddragon.leagueoflegends.com/cdn/6.24.1/img/profileicon/588.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + iconid + ".png";
    }
    
    /**
     * Gets profile icon.
     *
     * @param region       the region
     * @param summonerName the summoner name
     * @return the profile icon
     */
    public String getProfileIcon(Platform region, String summonerName)
    {
        // http://avatar.leagueoflegends.com/region/summonername.png
        return "http://avatar.leagueoflegends.com/" + region.toString() + Constants.SEPARATOR + summonerName + ".png";
    }
    
    /**
     * Gets splash art.
     *
     * @param championId the champion id
     * @param skinNum    the skin num
     * @return the splash art
     */
    public String getSplashArt(String championId, int skinNum)
    {
        Realm  realm = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn   = realm.getCDN();
        String path  = "img/champion/splash";
        
        // http://ddragon.leagueoflegends.com/cdn/img/champion/splash/Aatrox_0.jpg
        return cdn + Constants.SEPARATOR + path + Constants.SEPARATOR + championId + "_" + skinNum + ".png";
    }
    
    /**
     * Gets splash art.
     *
     * @param skin the skin
     * @return the splash art
     */
    public String getSplashArt(Skin skin)
    {
        Realm  realm = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn   = realm.getCDN();
        String path  = "img/champion/splash";
        
        // http://ddragon.leagueoflegends.com/cdn/img/champion/splash/Aatrox_0.jpg
        return cdn + Constants.SEPARATOR + path + Constants.SEPARATOR + skin.getId() + "_" + skin.getNum() + ".png";
    }
    
    /**
     * Gets loading screen art.
     *
     * @param championId the champion id
     * @param skinNum    the skin num
     * @return the loading screen art
     */
    public String getLoadingScreenArt(String championId, int skinNum)
    {
        Realm  realm = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn   = realm.getCDN();
        String path  = "img/champion/loading";
        
        // http://ddragon.leagueoflegends.com/cdn/img/champion/loading/Aatrox_0.jpg
        return cdn + Constants.SEPARATOR + path + Constants.SEPARATOR + championId + "_" + skinNum + ".png";
    }
    
    /**
     * Gets loading screen art.
     *
     * @param skin the skin
     * @return the loading screen art
     */
    public String getLoadingScreenArt(Skin skin)
    {
        Realm  realm = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn   = realm.getCDN();
        String path  = "img/champion/loading";
        
        // http://ddragon.leagueoflegends.com/cdn/img/champion/loading/Aatrox_0.jpg
        return cdn + Constants.SEPARATOR + path + Constants.SEPARATOR + skin.getId() + "_" + skin.getNum() + ".png";
    }
    
    
    /**
     * Gets square.
     *
     * @param champ   the champ
     * @param version the version
     * @return the square
     */
    public String getSquare(StaticChampion champ, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/champion";
        
        // http://ddragon.leagueoflegends.com/cdn/6.24.1/img/champion/Aatrox.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + champ.getImage().getFull();
    }
    
    /**
     * Gets square.
     *
     * @param champKey the champ key
     * @param version  the version
     * @return the square
     */
    public String getSquare(String champKey, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/champion";
        
        // http://ddragon.leagueoflegends.com/cdn/6.24.1/img/champion/Aatrox.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + champKey + ".png";
    }
    
    /**
     * Gets passive.
     *
     * @param passiveId the passive id
     * @param version   the version
     * @return the passive
     */
    public String getPassive(String passiveId, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/passive";
        
        // http://ddragon.leagueoflegends.com/cdn/6.24.1/img/passive/Anivia_P.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + passiveId + ".png";
    }
    
    /**
     * Gets passive.
     *
     * @param passive the passive
     * @param version the version
     * @return the passive
     */
    public String getPassive(Passive passive, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/passive";
        
        // http://ddragon.leagueoflegends.com/cdn/6.24.1/img/passive/Anivia_P.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + passive.getImage().getFull();
    }
    
    /**
     * Gets ability.
     *
     * @param spell   the spell
     * @param version the version
     * @return the ability
     */
    public String getAbility(StaticChampionSpell spell, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/spell";
        
        //  http://ddragon.leagueoflegends.com/cdn/6.24.1/img/spell/FlashFrost.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + spell.getImage().getFull();
    }
    
    /**
     * Gets summoner spell.
     *
     * @param spell   the spell
     * @param version the version
     * @return the summoner spell
     */
    public String getSummonerSpell(SummonerSpellType spell, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/spell";
        
        //  http://ddragon.leagueoflegends.com/cdn/6.24.1/img/spell/SummonerFlash.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + spell.getApiName() + ".png";
    }
    
    /**
     * Gets summoner spell.
     *
     * @param spell   the spell
     * @param version the version
     * @return the summoner spell
     */
    public String getSummonerSpell(String spell, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/spell";
        
        //  http://ddragon.leagueoflegends.com/cdn/6.24.1/img/spell/SummonerFlash.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + spell + ".png";
    }
    
    /**
     * Gets item.
     *
     * @param id      the id
     * @param version the version
     * @return the item
     */
    public String getItem(String id, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/item";
        
        //  http://ddragon.leagueoflegends.com/cdn/6.24.1/img/item/1001.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + id + ".png";
    }
    
    
    /**
     * Gets item.
     *
     * @param id      the id
     * @param version the version
     * @return the item
     */
    public String getItem(Item id, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/item";
        
        //  http://ddragon.leagueoflegends.com/cdn/6.24.1/img/item/1001.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + id.getImage().getFull();
    }
    
    /**
     * Gets mastery.
     *
     * @param id      the id
     * @param version the version
     * @return the mastery
     */
    public String getMastery(StaticMastery id, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/mastery";
        
        //  http://ddragon.leagueoflegends.com/cdn/6.24.1/img/mastery/6111.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + id.getImage().getFull();
    }
    
    /**
     * Gets mastery.
     *
     * @param id      the id
     * @param version the version
     * @return the mastery
     */
    public String getMastery(String id, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/mastery";
        
        //  http://ddragon.leagueoflegends.com/cdn/6.24.1/img/mastery/6111.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + id + ".png";
    }
    
    
    /**
     * Gets the spritesheet an image is taken from
     *
     * @param sprite  the sprite field from an image object
     * @param version the version
     * @return the spritesheet
     */
    public String getSpriteSheet(String sprite, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/sprite";
        
        //  http://ddragon.leagueoflegends.com/cdn/7.8.1/img/sprite/mastery0.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + sprite;
    }
    
    /**
     * Gets rune.
     *
     * @param id      the id
     * @param version the version
     * @return the rune
     */
    public String getRune(String id, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/rune";
        
        //  http://ddragon.leagueoflegends.com/cdn/6.24.1/img/rune/8001.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + id + ".png";
    }
    
    /**
     * Gets rune.
     *
     * @param rune    the rune
     * @param version the version
     * @return the rune
     */
    public String getRune(StaticRune rune, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/rune";
        
        //  http://ddragon.leagueoflegends.com/cdn/6.24.1/img/rune/8001.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + rune.getImage().getFull();
    }
    
    
    /**
     * Gets map.
     *
     * @param map     the map
     * @param version the version
     * @return the map
     */
    public String getMap(MapType map, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/map";
        
        // http://ddragon.leagueoflegends.com/cdn/6.8.1/img/map/map11.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + "map" + map.getId() + ".png";
    }
    
    /**
     * Gets map.
     *
     * @param map     the map
     * @param version the version
     * @return the map
     */
    public String getMap(String map, String version)
    {
        Realm  realm         = StaticAPI.getInstance().getRealm(Platform.EUW1);
        String cdn           = realm.getCDN();
        String versionString = version != null ? version : realm.getV();
        String path          = "img/map";
        
        // http://ddragon.leagueoflegends.com/cdn/6.8.1/img/map/map11.png
        return cdn + Constants.SEPARATOR + versionString + Constants.SEPARATOR + path + Constants.SEPARATOR + "map" + map + ".png";
    }
}
