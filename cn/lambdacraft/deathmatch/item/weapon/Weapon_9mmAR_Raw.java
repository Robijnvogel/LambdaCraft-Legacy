/** 
 * Copyright (c) LambdaCraft Modding Team, 2013
 * 版权许可：LambdaCraft 制作小组， 2013.
 * http://lambdacraft.half-life.cn/
 * 
 * LambdaCraft is open-source. It is distributed under the terms of the
 * LambdaCraft Open Source License. It grants rights to read, modify, compile
 * or run the code. It does *NOT* grant the right to redistribute this software
 * or its modifications in any form, binary or source, except if expressively
 * granted by the copyright holder.
 *
 * LambdaCraft是完全开源的。它的发布遵从《LambdaCraft开源协议》。你允许阅读，修改以及调试运行
 * 源代码， 然而你不允许将源代码以另外任何的方式发布，除非你得到了版权所有者的许可。
 */
package cn.lambdacraft.deathmatch.item.weapon;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cn.lambdacraft.core.CBCMod;
import cn.lambdacraft.crafting.register.CBCItems;
import cn.weaponmod.api.action.Action;
import cn.weaponmod.api.action.ActionAutomaticShoot;
import cn.weaponmod.api.action.ActionJam;
import cn.weaponmod.api.action.ActionReload;
import cn.weaponmod.api.action.ActionShoot;

/**
 * @author WeAthFolD
 *
 */
public class Weapon_9mmAR_Raw extends WeaponGeneralBullet_LC {

	public Weapon_9mmAR_Raw() {
		super(CBCItems.ammo_9mm2);
		setIAndU("weapon_9mmar");
		setCreativeTab(CBCMod.cct);
		setMaxDamage(51);
		
		actionShoot = new ActionAutomaticShoot(300, 4, 3, "lambdacraft:weapons.hksa");
		actionReload = new ActionReload(60, "lambdacraft:weapons.nmmarr", "");
		actionJam = new ActionJam(20, "lambdacraft:weapons.gunjam_a");
	}
}
