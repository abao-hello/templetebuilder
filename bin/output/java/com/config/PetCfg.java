package com.config;

import java.util.HashMap;

/***
 * PetTbl.java
 * PetCfg.java
 *
 * @Author: abaojin
 */
public class PetTbl {

	// #ID主键, 关联道具表Id
	private ﻿int Id;
	// 宠物头像图标
	private string Icon;
	// 宠物模型
	private string Model;
	// 宠物特效
	private string Effect;
	// 普通攻击技能id
	private int AttackSkillId;
	// 程序不用的注释
	private string Des;
	// 伤害类型
	private int DamageType;
	// 宠物战斗类型
	private int PetType;
	// 宠物物种
	private int PetClass;
	// 代数
	private int Generation;
	// 捕捉等级
	private int CatchLevel;
	// 天赋下限
	private int DowerMin;
	// 天赋上限
	private int DowerMax;
	// 悟性下限
	private int UnderstandMin;
	// 悟性上限
	private int UnderstandMax;
	// 可繁殖次数
	private int BreedMax;
	// 力量
	private int Str;
	// 升级力量加值
	private int StrLevelup;
	// 智力
	private int Wit;
	// 升级智力加值
	private int WitLevelup;
	// 敏捷
	private int Dex;
	// 升级敏捷加值
	private int DexLevelup;
	// 体力
	private int Vit;
	// 升级体力加值
	private int VitLevelup;
	// 被捕捉状态特效
	private int CatchEffect;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public string getIcon(){
		return Icon
	}
	public void setIcon(string Icon){
		this.Icon = Icon
	}
	
	public string getModel(){
		return Model
	}
	public void setModel(string Model){
		this.Model = Model
	}
	
	public string getEffect(){
		return Effect
	}
	public void setEffect(string Effect){
		this.Effect = Effect
	}
	
	public int getAttackSkillId(){
		return AttackSkillId
	}
	public void setAttackSkillId(int AttackSkillId){
		this.AttackSkillId = AttackSkillId
	}
	
	public string getDes(){
		return Des
	}
	public void setDes(string Des){
		this.Des = Des
	}
	
	public int getDamageType(){
		return DamageType
	}
	public void setDamageType(int DamageType){
		this.DamageType = DamageType
	}
	
	public int getPetType(){
		return PetType
	}
	public void setPetType(int PetType){
		this.PetType = PetType
	}
	
	public int getPetClass(){
		return PetClass
	}
	public void setPetClass(int PetClass){
		this.PetClass = PetClass
	}
	
	public int getGeneration(){
		return Generation
	}
	public void setGeneration(int Generation){
		this.Generation = Generation
	}
	
	public int getCatchLevel(){
		return CatchLevel
	}
	public void setCatchLevel(int CatchLevel){
		this.CatchLevel = CatchLevel
	}
	
	public int getDowerMin(){
		return DowerMin
	}
	public void setDowerMin(int DowerMin){
		this.DowerMin = DowerMin
	}
	
	public int getDowerMax(){
		return DowerMax
	}
	public void setDowerMax(int DowerMax){
		this.DowerMax = DowerMax
	}
	
	public int getUnderstandMin(){
		return UnderstandMin
	}
	public void setUnderstandMin(int UnderstandMin){
		this.UnderstandMin = UnderstandMin
	}
	
	public int getUnderstandMax(){
		return UnderstandMax
	}
	public void setUnderstandMax(int UnderstandMax){
		this.UnderstandMax = UnderstandMax
	}
	
	public int getBreedMax(){
		return BreedMax
	}
	public void setBreedMax(int BreedMax){
		this.BreedMax = BreedMax
	}
	
	public int getStr(){
		return Str
	}
	public void setStr(int Str){
		this.Str = Str
	}
	
	public int getStrLevelup(){
		return StrLevelup
	}
	public void setStrLevelup(int StrLevelup){
		this.StrLevelup = StrLevelup
	}
	
	public int getWit(){
		return Wit
	}
	public void setWit(int Wit){
		this.Wit = Wit
	}
	
	public int getWitLevelup(){
		return WitLevelup
	}
	public void setWitLevelup(int WitLevelup){
		this.WitLevelup = WitLevelup
	}
	
	public int getDex(){
		return Dex
	}
	public void setDex(int Dex){
		this.Dex = Dex
	}
	
	public int getDexLevelup(){
		return DexLevelup
	}
	public void setDexLevelup(int DexLevelup){
		this.DexLevelup = DexLevelup
	}
	
	public int getVit(){
		return Vit
	}
	public void setVit(int Vit){
		this.Vit = Vit
	}
	
	public int getVitLevelup(){
		return VitLevelup
	}
	public void setVitLevelup(int VitLevelup){
		this.VitLevelup = VitLevelup
	}
	
	public int getCatchEffect(){
		return CatchEffect
	}
	public void setCatchEffect(int CatchEffect){
		this.CatchEffect = CatchEffect
	}
	
}

public class PetCfg {
	public const string FILENAME = "Pet";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			PetTbl record = new PetTbl();
			
			record.Icon = table.GetString(i, "Icon");
			record.Model = table.GetString(i, "Model");
			record.Effect = table.GetString(i, "Effect");
			record.AttackSkillId = table.GetInt(i, "AttackSkillId");
			record.Des = table.GetString(i, "Des");
			record.DamageType = table.GetInt(i, "DamageType");
			record.PetType = table.GetInt(i, "PetType");
			record.PetClass = table.GetInt(i, "PetClass");
			record.Generation = table.GetInt(i, "Generation");
			record.CatchLevel = table.GetInt(i, "CatchLevel");
			record.DowerMin = table.GetInt(i, "DowerMin");
			record.DowerMax = table.GetInt(i, "DowerMax");
			record.UnderstandMin = table.GetInt(i, "UnderstandMin");
			record.UnderstandMax = table.GetInt(i, "UnderstandMax");
			record.BreedMax = table.GetInt(i, "BreedMax");
			record.Str = table.GetInt(i, "Str");
			record.StrLevelup = table.GetInt(i, "StrLevelup");
			record.Wit = table.GetInt(i, "Wit");
			record.WitLevelup = table.GetInt(i, "WitLevelup");
			record.Dex = table.GetInt(i, "Dex");
			record.DexLevelup = table.GetInt(i, "DexLevelup");
			record.Vit = table.GetInt(i, "Vit");
			record.VitLevelup = table.GetInt(i, "VitLevelup");
			record.CatchEffect = table.GetInt(i, "CatchEffect");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}