![Harvest with ease banner](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/harvest-with-ease/banner.gif)

---
![Minecraft](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/minecraft/minecraft.svg)[![1.20.2](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/minecraft/1-20-2.svg)](https://modrinth.com/mod/harvest-with-ease/versions?g=1.20.2)![Separator](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/separator.svg)

![Loader](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/loader/loader.svg)[![NeoForge](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/loader/neoforge.svg)](https://modrinth.com/mod/harvest-with-ease/versions?l=neoforge)![Separator](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/separator.svg)

![Overlay](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/side/client-server.svg)

![Issues](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/github/issues.svg)[![GitHub](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/github/github.svg)](https://github.com/TarantelTM/HarvestWithEaseNeoForge---1.20.2/issues)

---
## **Description**
Harvesting crops is such a pain, breaking them all to get the drops and then having to replant each one.  
Well, not anymore! With this mod you can just right click on your crops to harvest them and leaving a new plant to grow!  
It's also compatible with **any** modded crops, to ease your mind of one more thing!

***Note:***  
*Altough it's stated that the mod is required on both sides, it can be safely installed server-side only and still work.*  
*However when a client that does not have the mod connects to a server that does, and the player tries to harvest a crop while holding a block, it cause block flashing. The only way to prevent this glitch is to set `require hoe` to `true`.*

## **Features**
- Right-click to harvest any crop, works with both Vanilla and modded out of the box!  
  ![Harvesting wheat](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/harvest-with-ease/wheat.gif)
- Works on nether warts and cocoa beans too!  
  ![Harvesting cocoa](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/harvest-with-ease/cocoa.gif) ![Harvesting nether wart](https://raw.githubusercontent.com/Nyphet/mod-fancy-assets/main/harvest-with-ease/wart.gif)
- Correctly consumes 1 crop seed to simulate replanting!
- Right-click while holding an item with fortune to increase drops!
- **Highly configurable!** See next section for more details.

## **Configuration**
#### _This mod works already out of the box, configuration is only for further tweakings_
- **`require hoe`**: whether holding a hoe (either hands) is required to right-click harvest, defaults to `false`.
- **`damage on harvest`**: how much damage the hoe should receive upon use, effective only if `> 0` and **`require hoe`** is enabled.
- **`exp on harvest`**: how many experience points should be granted when right-click harvesting or break-harvesting, effective only if `> 0` (note it's exp _points_ and not exp _levels_).
- **`play sound`**: whether to play a sound when harvesting a crop, defaults to `true`.
- **`crops`**: list of additional in-game IDs for crops that are not supported out of the box, defaults to an empty list.  
  This last config option is just a safety measure, so far no crop needs it.

## **Dependencies**
NONE

## **License and right of use**
Feel free to use this mod for any modpack or video, just be sure to give credit and possibly link [here](https://github.com/Nyphet/harvest-with-ease#readme).  
This project is published under the [GNU General Public License v3.0](https://github.com/Nyphet/harvest-with-ease/blob/master/LICENSE).

## **For developers**
Your modded crops will work with this mod out of the box only if they extend the CropBlock class, which is how it should be.  
If, for whatever reason, you can't extend that class the **`crops`** config option is there exactly for you. Just add the in-game ID of your crop(s) to make it work, however note that this will work only if your crops have an Integer Property whose name is set to be `"age"` and represents the age values your crops can have, from `0` to a `max` value.

Since version 6.0.0.0, an API is available to better integrate your mod with this one. Note however that this should rarely be necessary. To learn how to use the provided API follow the [Wiki](https://github.com/Nyphet/harvest-with-ease/wiki) on [GitHub](https://github.com/Nyphet/harvest-with-ease).
