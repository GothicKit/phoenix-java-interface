package dev.gothickit.phoenix;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Pointer;
import dev.gothickit.phoenix.cffi.*;

public interface PhoenixNative extends Library {
	void pxLoggerSet(LoggingFunc logger);

	void pxLoggerSetDefault();

	PxBuffer pxBufferMmap(final String file);

	PxBuffer pxBufferCreate(char[] bytes, int size);

	void pxBufferDestroy(PxBuffer buffer);

	long pxBufferSize(PxBuffer buffer);

	Pointer pxBufferArray(PxBuffer buffer);

	PxVfs pxVfsNew();

	PxVfs pxVfsMountDisk(PxVfs vfs, String path);

	void pxVfsDestroy(PxVfs vdf);

	PxVfsNode pxVfsGetNodeByName(PxVfs vdf, String name);

	PxBuffer pxVfsNodeOpenBuffer(PxVfsNode node);

	PxModelAnimation pxManLoad(PxBuffer buffer);

	PxModelAnimation pxManLoadFromVfs(PxVfs vdf, String name);

	void pxManDestroy(PxModelAnimation man);

	String pxManGetName(PxModelAnimation man);

	String pxManGetNext(PxModelAnimation man);

	int pxManGetLayer(PxModelAnimation man);

	int pxManGetFrameCount(PxModelAnimation man);

	int pxManGetNodeCount(PxModelAnimation man);

	float pxManGetFps(PxModelAnimation man);

	PxAABB.ByValue pxManGetBbox(PxModelAnimation man);

	int pxManGetChecksum(PxModelAnimation man);

	int pxManGetSampleCount(PxModelAnimation man);

	void pxManGetSample(PxModelAnimation man, int index, PxVec3 position, PxQuat rotation);

	Pointer pxManGetNodeIndices(PxModelAnimation man, int[] length);

	PxCutsceneLib pxCslLoad(PxBuffer buffer);

	PxCutsceneLib pxCslLoadFromVfs(PxVfs vdf, String name);

	void pxCslDestroy(PxCutsceneLib csl);

	String pxCslGetBlock(PxCutsceneLib csl, String name, int[] type);

	PxDaedalusScript pxScriptLoad(PxBuffer buffer);

	PxDaedalusScript pxScriptLoadFromVfs(PxVfs vdf, String name);

	void pxScriptEnumerateSymbols(PxDaedalusScript script, PxDaedalusEnumerateCallback cb);

	byte pxScriptGetInstruction(PxDaedalusScript script, int ip, PxDaedalusInstruction info);

	String pxScriptSymbolGetName(PxDaedalusSymbol sym);

	void pxScriptSymbolGetInfo(PxDaedalusSymbol sym, PxDaedalusSymbolInfo info);

	int pxScriptSymbolGetInt(PxDaedalusSymbol sym, int offset);

	float pxScriptSymbolGetFloat(PxDaedalusSymbol sym, int offset);

	String pxScriptSymbolGetString(PxDaedalusSymbol sym, int offset);

	void pxScriptDestroy(PxDaedalusScript world);

	PxDaedalusSymbol pxScriptGetSymbolById(PxDaedalusScript script, int id);

	PxDaedalusSymbol pxScriptGetSymbolByAddress(PxDaedalusScript script, int address);

	PxDaedalusSymbol pxScriptGetSymbolByName(PxDaedalusScript script, String name);

	PxFont pxFntLoad(PxBuffer buffer);

	PxFont pxFntLoadFromVfs(PxVfs vdf, String name);

	void pxFntDestroy(PxFont fnt);

	String pxFntGetName(PxFont fnt);

	int pxFntGetHeight(PxFont fnt);

	int pxFntGetGlyphCount(PxFont fnt);

	void pxFntGetGlyph(PxFont fnt, int index, int[] width, PxVec2 upper, PxVec2 lower);

	String pxMatGetName(PxMaterial mat);

	int pxMatGetGroup(PxMaterial mat);

	int pxMatGetColor(PxMaterial mat);

	float pxMatGetSmoothAngle(PxMaterial mat);

	String pxMatGetTexture(PxMaterial mat);

	PxVec2.ByValue pxMatGetTextureScale(PxMaterial mat);

	float pxMatGetTextureAnimFps(PxMaterial mat);

	int pxMatGetTextureAnimMapMode(PxMaterial mat);

	PxVec2.ByValue pxMatGetTextureAnimMapDir(PxMaterial mat);

	boolean pxMatGetDisableCollision(PxMaterial mat);

	boolean pxMatGetDisableLightmap(PxMaterial mat);

	boolean pxMatGetDontCollapse(PxMaterial mat);

	String pxMatGetDetailObject(PxMaterial mat);

	PxVec2.ByValue pxMatGetDetailTextureScale(PxMaterial mat);

	boolean pxMatGetForceOcculuder(PxMaterial mat);

	boolean pxMatGetEnvironmentMapping(PxMaterial mat);

	float pxMatGetEnvironmentMappingStrength(PxMaterial mat);

	int pxMatGetWaveMode(PxMaterial mat);

	int pxMatGetWaveSpeed(PxMaterial mat);

	float pxMatGetWaveMaxAmplitude(PxMaterial mat);

	float pxMatGetWaveGridSize(PxMaterial mat);

	boolean pxMatGetIgnoreSun(PxMaterial mat);

	int pxMatGetAlphaFunc(PxMaterial mat);

	PxVec2.ByValue pxMatGetDefaultMapping(PxMaterial mat);

	PxMesh pxMshLoad(PxBuffer buffer);

	PxMesh pxMshLoadFromVfs(PxVfs vdf, String name);

	void pxMshDestroy(PxMesh msh);

	String pxMshGetName(PxMesh msh);

	PxAABB.ByValue pxMshGetBbox(PxMesh msh);

	int PxMshGetMaterialCount(PxMesh msh);

	PxMaterial pxMshGetMaterial(PxMesh msh, int i);

	int pxMshGetVertexCount(PxMesh msh);

	PxVec3 pxMshGetVertex(PxMesh msh, int i);

	int pxMshGetFeatureCount(PxMesh msh);

	void pxMshGetFeature(PxMesh msh, int index, PxVec2 texture, int[] light, PxVec3 normal);

	Pointer pxMshGetPolygonMaterialIndices(PxMesh msh, int[] length);

	Pointer pxMshGetPolygonFeatureIndices(PxMesh msh, int[] length);

	Pointer pxMshGetPolygonVertexIndices(PxMesh msh, int[] length);

	PxModel pxMdlLoad(PxBuffer buffer);

	PxModel pxMdlLoadFromVfs(PxVfs vdf, String name);

	void pxMdlDestroy(PxModel mdl);

	PxModelHierarchy pxMdlGetHierarchy(PxModel mdl);

	PxModelMesh pxMdlGetMesh(PxModel mdl);

	PxModelHierarchy pxMdhLoad(PxBuffer buffer);

	PxModelHierarchy pxMdhLoadFromVfs(PxVfs vdf, String name);

	void pxMdhDestroy(PxModelHierarchy mdl);

	PxAABB.ByValue pxMdhGetBbox(PxModelHierarchy mdh);

	PxAABB.ByValue pxMdhGetCollisionBbox(PxModelHierarchy mdh);

	PxVec3.ByValue pxMdhGetRootTranslation(PxModelHierarchy mdh);

	int pxMdhGetChecksum(PxModelHierarchy mdh);

	int pxMdhGetNodeCount(PxModelHierarchy mdh);

	void pxMdhGetNode(PxModelHierarchy mdh, int index, short[] parent, String[] name, PxMat4x4 transform);

	PxModelMesh pxMdmLoad(PxBuffer buffer);

	PxModelMesh pxMdmLoadFromVfs(PxVfs vdf, String name);

	void pxMdmDestroy(PxModelMesh mdm);

	int pxMdmGetMeshCount(PxModelMesh mdm);

	PxSoftSkinMesh pxMdmGetMesh(PxModelMesh mdm, int i);

	PxMultiResolutionMesh pxMdmGetAttachment(PxModelMesh mdm, String name);

	int pxMdmGetChecksum(PxModelMesh mdm);

	PxMultiResolutionMesh pxSsmGetMesh(PxSoftSkinMesh ssm);

	int pxSsmGetWedgeNormalsCount(PxSoftSkinMesh ssm);

	void pxSsmGetWedgeNormal(PxSoftSkinMesh ssm, int i, PxVec3 normal, int index);

	int pxSsmGetNodeCount(PxSoftSkinMesh ssm);

	int pxSsmGetNodeWeightCount(PxSoftSkinMesh ssm, int node);

	void pxSsmGetNodeWeight(PxSoftSkinMesh ssm, int node, int i, float[] weight, PxVec3 position, short[] index);

	Pointer pxSsmGetNodes(PxSoftSkinMesh ssm, int[] length);

	PxModelScript pxMdsLoad(PxBuffer buffer);

	PxModelScript pxMdsLoadFromVfs(PxVfs vdf, String name);

	void pxMdsDestroy(PxModelScript mds);

	String pxMdsGetSkeletonName(PxModelScript mds);

	boolean pxMdsGetSkeletonDisableMesh(PxModelScript mds);

	int pxMdsGetMeshCount(PxModelScript mds);

	String pxMdsGetMesh(PxModelScript mds, int i);

	int pxMdsGetDisabledAnimationsCount(PxModelScript mds);

	String pxMdsGetDisabledAnimation(PxModelScript mds, int i);

	int pxMdsGetModelTagCount(PxModelScript mds);

	String pxMdsGetModelTagBone(PxModelScript mds, int i);

	int pxMdsGetAnimationCombinationCount(PxModelScript mds);

	String pxMdsGetAnimationCombinationName(PxModelScript mds, int i);

	int pxMdsGetAnimationCombinationLayer(PxModelScript mds, int i);

	String pxMdsGetAnimationCombinationNext(PxModelScript mds, int i);

	float pxMdsGetAnimationCombinationBlendIn(PxModelScript mds, int i);

	float pxMdsGetAnimationCombinationBlendOut(PxModelScript mds, int i);

	int pxMdsGetAnimationCombinationFlags(PxModelScript mds, int i);

	String pxMdsGetAnimationCombinationModel(PxModelScript mds, int i);

	int pxMdsGetAnimationCombinationLastFrame(PxModelScript mds, int i);

	int pxMdsGetAnimationBlendingCount(PxModelScript mds);

	String pxMdsGetAnimationBlendingName(PxModelScript mds, int i);

	String pxMdsGetAnimationBlendingNext(PxModelScript mds, int i);

	float pxMdsGetAnimationBlendingBlendIn(PxModelScript mds, int i);

	float pxMdsGetAnimationBlendingBlendOut(PxModelScript mds, int i);

	int pxMdsGetAnimationAliasCount(PxModelScript mds);

	String pxMdsGetAnimationAliasName(PxModelScript mds, int i);

	int pxMdsGetAnimationAliasLayer(PxModelScript mds, int i);

	String pxMdsGetAnimationAliasNext(PxModelScript mds, int i);

	float pxMdsGetAnimationAliasBlendIn(PxModelScript mds, int i);

	float pxMdsGetAnimationAliasBlendOut(PxModelScript mds, int i);

	int pxMdsGetAnimationAliasFlags(PxModelScript mds, int i);

	String pxMdsGetAnimationAliasAlias(PxModelScript mds, int i);

	int pxMdsGetAnimationAliasDirection(PxModelScript mds, int i);

	int pxMdsGetAnimationCount(PxModelScript mds);

	String pxMdsGetAnimationName(PxModelScript mds, int i);

	int pxMdsGetAnimationLayer(PxModelScript mds, int i);

	String pxMdsGetAnimationNext(PxModelScript mds, int i);

	float pxMdsGetAnimationBlendIn(PxModelScript mds, int i);

	float pxMdsGetAnimationBlendOut(PxModelScript mds, int i);

	int pxMdsGetAnimationFlags(PxModelScript mds, int i);

	String pxMdsGetAnimationModel(PxModelScript mds, int i);

	int pxMdsGetAnimationDirection(PxModelScript mds, int i);

	int pxMdsGetAnimationFirstFrame(PxModelScript mds, int i);

	int pxMdsGetAnimationLastFrame(PxModelScript mds, int i);

	float pxMdsGetAnimationFps(PxModelScript mds, int i);

	float pxMdsGetAnimationSpeed(PxModelScript mds, int i);

	float pxMdsGetAnimationCollisionVolumeScale(PxModelScript mds, int i);

	int pxMdsGetAnimation_EventTagCount(PxModelScript mds, int i);

	int pxMdsGetAnimation_EventTagFrame(PxModelScript mds, int animIndex, int eventTagIndex);

	int pxMdsGetAnimation_EventTagType(PxModelScript mds, int animIndex, int eventTagIndex);

	String pxMdsGetAnimation_EventTagSlot(PxModelScript mds, int animIndex, int eventTagIndex);

	String pxMdsGetAnimation_EventTagSlot2(PxModelScript mds, int animIndex, int eventTagIndex);

	String pxMdsGetAnimation_EventTagItem(PxModelScript mds, int animIndex, int eventTagIndex);

	int pxMdsGetAnimation_EventTagFrames(PxModelScript mds, int animIndex, int eventTagIndex, int size);

	int pxMdsGetAnimation_EventTagFightMode(PxModelScript mds, int animIndex, int eventTagIndex);

	boolean pxMdsGetAnimation_EventTagAttached(PxModelScript mds, int animIndex, int eventTagIndex);

	int pxMdsGetAnimation_EventPfxCount(PxModelScript mds, int i);

	int pxMdsGetAnimation_EventPfxFrame(PxModelScript mds, int animIndex, int eventIndex);

	int pxMdsGetAnimation_EventPfxIndex(PxModelScript mds, int animIndex, int eventIndex);

	String pxMdsGetAnimation_EventPfxName(PxModelScript mds, int animIndex, int eventIndex);

	String pxMdsGetAnimation_EventPfxPosition(PxModelScript mds, int animIndex, int eventIndex);

	boolean pxMdsGetAnimation_EventPfxAttached(PxModelScript mds, int animIndex, int eventIndex);

	int pxMdsGetAnimation_EventPfxStopCount(PxModelScript mds, int i);

	void pxMdsGetAnimation_EventPfxStop(PxModelScript mds, int animIndex, int pfxStopIndex, int frame, int index);

	int pxMdsGetAnimation_EventSfxCount(PxModelScript mds, int i);

	int pxMdsGetAnimation_EventSfxFrame(PxModelScript mds, int animIndex, int sfxIndex);

	String pxMdsGetAnimation_EventSfxName(PxModelScript mds, int animIndex, int sfxIndex);

	float pxMdsGetAnimation_EventSfxRange(PxModelScript mds, int animIndex, int sfxIndex);

	boolean pxMdsGetAnimation_EventSfxEmptySlot(PxModelScript mds, int animIndex, int sfxIndex);

	int pxMdsGetAnimationEventSfxGroundCount(PxModelScript mds, int i);

	int pxMdsGetAnimation_EventSfxGroundFrame(PxModelScript mds, int animIndex, int sfxIndex);

	String pxMdsGetAnimation_EventSfxGroundName(PxModelScript mds, int animIndex, int sfxIndex);

	float pxMdsGetAnimation_EventSfxGroundRange(PxModelScript mds, int animIndex, int sfxIndex);

	boolean pxMdsGetAnimation_EventSfxGroundEmptySlot(PxModelScript mds, int animIndex, int sfxIndex);

	int pxMdsGetAnimation_EventMorphAnimateCount(PxModelScript mds, int i);

	int pxMdsGetAnimation_EventMorphAnimateFrame(PxModelScript mds, int animIndex, int morphIndex);

	String pxMdsGetAnimation_EventMorphAnimateAnimation(PxModelScript mds, int animIndex, int morphIndex);

	String pxMdsGetAnimation_EventMorphAnimateNode(PxModelScript mds, int animIndex, int morphIndex);

	int pxMdsGetAnimation_EventCameraTremorCount(PxModelScript mds, int i);

	void pxMdsGetAnimation_EventCameraTremor(PxModelScript mds, int animIndex, int tremorIndex, int frame, int field1,
											 int field2, int field3, int field4);

	PxMorphMesh pxMmbLoad(PxBuffer buffer);

	PxMorphMesh pxMmbLoadFromVfs(PxVfs vdf, String name);

	void pxMmbDestroy(PxMorphMesh mmb);

	String pxMmbGetName(PxMorphMesh mmb);

	PxMultiResolutionMesh pxMmbGetMesh(PxMorphMesh mmb);

	int pxMmbGetMorphPositionCount(PxMorphMesh mmb);

	PxVec3.ByValue pxMmbGetMorphPosition(PxMorphMesh mmb, int i);

	int pxMmbGetAnimationCount(PxMorphMesh mmb);

	PxMorphMeshAnimation pxMmbGetAnimation(PxMorphMesh mmb, int i);

	String pxMmbAniGetName(PxMorphMeshAnimation ani);

	int pxMmbAniGetLayer(PxMorphMeshAnimation ani);

	float pxMmbAniGetBlendIn(PxMorphMeshAnimation ani);

	float pxMmbAniGetBlendOut(PxMorphMeshAnimation ani);

	float pxMmbAniGetDuration(PxMorphMeshAnimation ani);

	float pxMmbAniGetSpeed(PxMorphMeshAnimation ani);

	byte pxMmbAniGetFlags(PxMorphMeshAnimation ani);

	int pxMmbAniGetFrameCount(PxMorphMeshAnimation ani);

	Pointer pxMmbAniGetVertices(PxMorphMeshAnimation ani, int[] length);

	int pxMmbAniGetSampleCount(PxMorphMeshAnimation ani);

	PxVec3.ByValue pxMmbAniGetSample(PxMorphMeshAnimation ani, int i);

	PxMultiResolutionMesh pxMrmLoad(PxBuffer buffer);

	PxMultiResolutionMesh pxMrmLoadFromVfs(PxVfs vdf, String name);

	void pxMrmDestroy(PxMultiResolutionMesh mrm);

	int pxMrmGetPositionCount(PxMultiResolutionMesh mrm);

	PxVec3 pxMrmGetPosition(PxMultiResolutionMesh mrm, int i);

	int pxMrmGetNormalCount(PxMultiResolutionMesh mrm);

	PxVec3 pxMrmGetNormal(PxMultiResolutionMesh mrm, int i);

	int pxMrmGetSubMeshCount(PxMultiResolutionMesh mrm);

	PxMultiResolutionSubMesh pxMrmGetSubMesh(PxMultiResolutionMesh mrm, int i);

	int pxMrmGetMaterialCount(PxMultiResolutionMesh mrm);

	PxMaterial pxMrmGetMaterial(PxMultiResolutionMesh mrm, int i);

	int pxMrmGetAlphaTest(PxMultiResolutionMesh mrm);

	PxAABB.ByValue pxMrmGetBbox(PxMultiResolutionMesh mrm);

	PxMaterial pxMrmSubMeshGetMaterial(PxMultiResolutionSubMesh sub);

	int pxMrmSubMeshGetTriangleCount(PxMultiResolutionSubMesh sub);

	void pxMrmSubMeshGetTriangle(PxMultiResolutionSubMesh sub, int i, short[] a, short[] b, short[] c);

	int pxMrmSubMeshGetWedgeCount(PxMultiResolutionSubMesh sub);

	void pxMrmSubMeshGetWedge(PxMultiResolutionSubMesh sub, int i, PxVec3 normal, PxVec2 texture, short[] index);

	Pointer pxMrmSubMeshGetColors(PxMultiResolutionSubMesh sub, int[] length);

	Pointer pxMrmSubMeshGetTrianglePlaneIndices(PxMultiResolutionSubMesh sub, int[] length);

	int pxMrmSubMeshGetTrianglePlaneCount(PxMultiResolutionSubMesh sub);

	void pxMrmSubMeshGetTrianglePlane(PxMultiResolutionSubMesh sub, int i, float[] distance, PxVec3 normal);

	int pxMrmSubMeshGetTriangleEdgeCount(PxMultiResolutionSubMesh sub);

	void pxMrmSubMeshGetTriangleEdge(PxMultiResolutionSubMesh sub, int i, short[] a, short[] b, short[] c);

	int pxMrmSubMeshGetEdgeCount(PxMultiResolutionSubMesh sub);

	void pxMrmSubMeshGetEdge(PxMultiResolutionSubMesh sub, int i, short[] a, short[] b);

	Pointer pxMrmSubMeshGetEdgeScores(PxMultiResolutionSubMesh sub, int[] length);

	Pointer pxMrmSubMeshGetWedgeMap(PxMultiResolutionSubMesh sub, int[] length);

	PxTexture pxTexLoad(PxBuffer buffer);

	PxTexture pxTexLoadFromVfs(PxVfs vdf, String name);

	PxTexture pxTexDestroy(PxTexture tex);

	void pxTexGetMeta(PxTexture tex, int[] format, int[] width, int[] height, int[] mipmapCount, int[] averageColor);

	Pointer pxTexGetMipmap(PxTexture tex, int level, int[] width, int[] height);

	Pointer pxTexGetDecompressedMipmap(PxTexture tex, int level, int[] width, int[] height);

	void pxTexFreeDecompressedMipmap(Pointer tex);

	PxVm pxVmLoad(PxBuffer buffer);

	PxVm pxVmLoadFromVfs(PxVfs vdf, String name);

	void pxVmDestroy(PxVm vm);

	PxVmInstance pxVmStackPopInstance(PxVm vm);

	String pxVmStackPopString(PxVm vm);

	float pxVmStackPopFloat(PxVm vm);

	int pxVmStackPopInt(PxVm vm);

	void pxVmStackPushInstance(PxVm vm, PxVmInstance instance);

	void pxVmStackPushString(PxVm vm, String string);

	void pxVmStackPushFloat(PxVm vm, float f);

	void pxVmStackPushInt(PxVm vm, int i);

	void pxVmRegisterExternal(PxVm vm, String name, PxVmExternalCallback cb);

	void pxVmRegisterExternalDefault(PxVm vm, PxVmExternalDefaultCallback cb);

	PxVmInstance pxVmGetGlobalSelf(PxVm vm);

	PxVmInstance pxVmGetGlobalOther(PxVm vm);

	PxVmInstance pxVmGetGlobalVictim(PxVm vm);

	PxVmInstance pxVmGetGlobalHero(PxVm vm);

	PxVmInstance pxVmGetGlobalItem(PxVm vm);

	PxVmInstance pxVmSetGlobalSelf(PxVm vm, PxVmInstance instance);

	PxVmInstance pxVmSetGlobalOther(PxVm vm, PxVmInstance instance);

	PxVmInstance pxVmSetGlobalVictim(PxVm vm, PxVmInstance instance);

	PxVmInstance pxVmSetGlobalHero(PxVm vm, PxVmInstance instance);

	PxVmInstance pxVmSetGlobalItem(PxVm vm, PxVmInstance instance);

	boolean pxVmCallFunction(PxVm vm, String func, Object... o);

	boolean pxVmCallFunctionByIndex(PxVm vm, int index, String args, Object... o);

	PxVmInstance pxVmInstanceAllocateByName(PxVm vm, String name, int type);

	PxVmInstance pxVmInstanceAllocateByIndex(PxVm vm, int index, int type);

	PxVmInstance pxVmInstanceInitializeByIndex(PxVm vm, String name, int type, PxVmInstance existing);

	PxVmInstance pxVmInstanceInitializeByName(PxVm vm, int index, int type, PxVmInstance existing);

	int pxVmInstanceGetSymbolIndex(PxVmInstance instance);

	void pxVmPrintStackTrace(PxVm vm);

	void pxVmEnumerateInstancesByClassName(PxVm vm, String name, PxVmEnumerateInstancesCallback cb);

	int pxVmInstanceNpcGetId(PxVmInstance instance);

	int pxVmInstanceNpcGetNameLength(PxVmInstance instance);

	String pxVmInstanceNpcGetName(PxVmInstance instance, int i);

	int pxVmInstanceNpcGetRoutine(PxVmInstance instance);

	int pxVmInstanceItemGetId(PxVmInstance instance);

	String pxVmInstanceItemGetName(PxVmInstance instance);

	String pxVmInstanceItemGetNameId(PxVmInstance instance);

	int pxVmInstanceItemGetHp(PxVmInstance instance);

	int pxVmInstanceItemGetHpMax(PxVmInstance instance);

	int pxVmInstanceItemGetMainFlag(PxVmInstance instance);

	int pxVmInstanceItemGetFlags(PxVmInstance instance);

	int pxVmInstanceItemGetWeight(PxVmInstance instance);

	int pxVmInstanceItemGetValue(PxVmInstance instance);

	int pxVmInstanceItemGetDamageType(PxVmInstance instance);

	int pxVmInstanceItemGetDamageTotal(PxVmInstance instance);

	int pxVmInstanceItemGetDamageLength(PxVmInstance instance);

	int pxVmInstanceItemGetDamage(PxVmInstance instance, int i);

	int pxVmInstanceItemGetWear(PxVmInstance instance);

	int pxVmInstanceItemGetProtectionLength(PxVmInstance instance);

	int pxVmInstanceItemGetProtection(PxVmInstance instance, int i);

	int pxVmInstanceItemGetNutrition(PxVmInstance instance);

	int pxVmInstanceItemGetCondAtrLength(PxVmInstance instance);

	int pxVmInstanceItemGetCondAtr(PxVmInstance instance, int i);

	int pxVmInstanceItemGetCondValueLength(PxVmInstance instance);

	int pxVmInstanceItemGetCondValue(PxVmInstance instance, int i);

	int pxVmInstanceItemGetChangeAtrLength(PxVmInstance instance);

	int pxVmInstanceItemGetChangeAtr(PxVmInstance instance, int i);

	int pxVmInstanceItemGetChangeValueLength(PxVmInstance instance);

	int pxVmInstanceItemGetChangeValue(PxVmInstance instance, int i);

	int pxVmInstanceItemGetMagic(PxVmInstance instance);

	int pxVmInstanceItemGetOnEquip(PxVmInstance instance);

	int pxVmInstanceItemGetOnUnequip(PxVmInstance instance);

	int pxVmInstanceItemGetOnStateLength(PxVmInstance instance);

	int pxVmInstanceItemGetOnState(PxVmInstance instance, int i);

	int pxVmInstanceItemGetOwner(PxVmInstance instance);

	int pxVmInstanceItemGetOwnerGuild(PxVmInstance instance);

	int pxVmInstanceItemGetDisguiseGuild(PxVmInstance instance);

	String pxVmInstanceItemGetVisual(PxVmInstance instance);

	String pxVmInstanceItemGetVisualChange(PxVmInstance instance);

	String pxVmInstanceItemGetEffect(PxVmInstance instance);

	int pxVmInstanceItemGetVisualSkin(PxVmInstance instance);

	String pxVmInstanceItemGetSchemeName(PxVmInstance instance);

	int pxVmInstanceItemGetMaterial(PxVmInstance instance);

	int pxVmInstanceItemGetMunition(PxVmInstance instance);

	int pxVmInstanceItemGetSpell(PxVmInstance instance);

	int pxVmInstanceItemGetRange(PxVmInstance instance);

	int pxVmInstanceItemGetMagCircle(PxVmInstance instance);

	String pxVmInstanceItemGetDescription(PxVmInstance instance);

	int pxVmInstanceItemGetTextLength(PxVmInstance instance);

	String pxVmInstanceItemGetText(PxVmInstance instance, int i);

	int pxVmInstanceItemGetCountLength(PxVmInstance instance);

	int pxVmInstanceItemGetCount(PxVmInstance instance, int i);

	int pxVmInstanceItemGetInvZbias(PxVmInstance instance);

	int pxVmInstanceItemGetInvRotX(PxVmInstance instance);

	int pxVmInstanceItemGetInvRotY(PxVmInstance instance);

	int pxVmInstanceItemGetInvRotZ(PxVmInstance instance);

	int pxVmInstanceItemGetInvAnimate(PxVmInstance instance);

	String pxVmInstanceSfxGetFile(PxVmInstance instance);

	int pxVmInstanceSfxGetPitchOff(PxVmInstance instance);

	int pxVmInstanceSfxGetPitchVar(PxVmInstance instance);

	int pxVmInstanceSfxGetVol(PxVmInstance instance);

	int pxVmInstanceSfxGetLoop(PxVmInstance instance);

	int pxVmInstanceSfxGetLoopStartOffset(PxVmInstance instance);

	int pxVmInstanceSfxGetLoopEndOffset(PxVmInstance instance);

	float pxVmInstanceSfxGetReverbLevel(PxVmInstance instance);

	String pxVmInstanceSfxGetPfxName(PxVmInstance instance);

	String pxVmInstanceMusicGetFile(PxVmInstance instance);

	float pxVmInstanceMusicGetVol(PxVmInstance instance);

	int pxVmInstanceMusicGetLoop(PxVmInstance instance);

	float pxVmInstanceMusicGetReverbMix(PxVmInstance instance);

	float pxVmInstanceMusicGetReverbTime(PxVmInstance instance);

	int pxVmInstanceMusicGetTransitionType(PxVmInstance instance);

	int pxVmInstanceMusicGetTransitionSubType(PxVmInstance instance);

	PxWorld pxWorldLoad(PxBuffer buffer);

	PxWorld pxWorldLoadFromVfs(PxVfs vdf, String name);

	void pxWorldDestroy(PxWorld world);

	PxMesh pxWorldGetMesh(PxWorld world);

	int pxWorldGetWayPointCount(PxWorld world);

	void pxWorldGetWayPoint(PxWorld world, int index, String[] name, PxVec3 position, PxVec3 direction,
							boolean[] freePoint, boolean[] underwater, int[] waterDepth);

	int pxWorldGetWayEdgeCount(PxWorld world);

	void pxWorldGetWayEdge(PxWorld world, int index, int[] a, int[] b);

	int pxWorldGetRootVobCount(PxWorld world);

	PxVob pxWorldGetRootVob(PxWorld world, int index);

	int pxVobGetType(PxVob vob);

	int pxVobGetId(PxVob vob);

	PxAABB.ByValue pxVobGetBbox(PxVob vob);

	PxVec3.ByValue pxVobGetPosition(PxVob vob);

	PxMat3x3.ByValue pxVobGetRotation(PxVob vob);

	boolean pxVobGetShowVisual(PxVob vob);

	int pxVobGetSpriteAlignment(PxVob vob);

	boolean pxVobGetCdStatic(PxVob vob);

	boolean pxVobGetCdDynamic(PxVob vob);

	boolean pxVobGetVobStatic(PxVob vob);

	int pxVobGetShadowMode(PxVob vob);

	boolean pxVobGetPhysicsEnabled(PxVob vob);

	int pxVobGetAnimationMode(PxVob vob);

	int pxVobGetBias(PxVob vob);

	boolean pxVobGetAmbient(PxVob vob);

	float pxVobGetAnimationStrength(PxVob vob);

	float pxVobGetFarClipScale(PxVob vob);

	String pxVobGetPresetName(PxVob vob);

	String pxVobGetVobName(PxVob vob);

	String pxVobGetVisualName(PxVob vob);

	int pxVobGetVisualType(PxVob vob);

	int pxVobGetChildCount(PxVob vob);

	PxVob pxVobGetChild(PxVob vob, int i);

	boolean pxVobGetGetHasDecal(PxVob vob);

	String pxVobGetDecalName(PxVob vob);

	PxVec2 pxVobGetDecalDimension(PxVob vob);

	PxVec2 pxVobGetDecalOffset(PxVob vob);

	boolean pxVobGetDecalTwoSided(PxVob vob);

	int pxVobGetDecalAlphaFunc(PxVob vob);

	float pxVobGetDecalTextureAnimFps(PxVob vob);

	byte pxVobGetDecalAlphaWeight(PxVob vob);

	boolean pxVobGetDecalIgnoreDaylight(PxVob vob);

	String pxVobItemGetInstance(PxVobItem item);

	String pxVobMobGetName(PxVobMob mob);

	int pxVobMobGetHp(PxVobMob mob);

	int pxVobMobGetDamage(PxVobMob mob);

	boolean pxVobMobGetMovable(PxVobMob mob);

	boolean pxVobMobGetTakable(PxVobMob mob);

	boolean pxVobMobGetFocusOverride(PxVobMob mob);

	int pxVobMobGetMaterial(PxVobMob mob);

	String pxVobMobGetVisualDestroyed(PxVobMob mob);

	String pxVobMobGetOwner(PxVobMob mob);

	String pxVobMobGetOwnerGuild(PxVobMob mob);

	boolean pxVobMobGetDestroyed(PxVobMob mob);

	int pxVobMobInterGetState(PxVobMobInter mobInter);

	String pxVobMobInterGetTarget(PxVobMobInter mobInter);

	String pxVobMobInterGetItem(PxVobMobInter mobInter);

	String pxVobMobInterGetConditionFunction(PxVobMobInter mobInter);

	String pxVobMobInterGetOnStateChangeFunction(PxVobMobInter mobInter);

	boolean pxVobMobInterGetRewind(PxVobMobInter mobInter);

	String pxVobMobFireGetSlot(PxVobMobFire mobFire);

	String pxVobMobFireGetVobTree(PxVobMobFire mobFire);

	boolean pxVobMobContainerGetLocked(PxVobMobContainer mobContainer);

	String pxVobMobContainerGetKey(PxVobMobContainer mobContainer);

	String pxVobMobContainerGetPickString(PxVobMobContainer mobContainer);

	String pxVobMobContainerGetContents(PxVobMobContainer mobContainer);

	boolean pxVobMobDoorGetLocked(PxVobMobDoor mobDoor);

	String pxVobMobDoorGetKey(PxVobMobDoor mobDoor);

	String pxVobMobDoorGetPickString(PxVobMobDoor mobDoor);

	float pxVobSoundGetVolume(PxVobSound sound);

	int pxVobSoundGetSoundMode(PxVobSound sound);

	float pxVobSoundGetRandomDelay(PxVobSound sound);

	float pxVobSoundGetRandomDelayVar(PxVobSound sound);

	boolean pxVobSoundGetInitiallyPlaying(PxVobSound sound);

	boolean pxVobSoundGetAmbient3d(PxVobSound sound);

	boolean pxVobSoundGetObstruction(PxVobSound sound);

	float pxVobSoundGetConeAngle(PxVobSound sound);

	int pxVobSoundGetSoundTriggerVolume(PxVobSound sound);

	float pxVobSoundGetRadius(PxVobSound sound);

	String pxVobSoundGetSoundName(PxVobSound sound);

	float pxVobSoundDaytimeStartTime(PxVobSoundDaytime soundDaytime);

	float pxVobSoundDaytimeEndTime(PxVobSoundDaytime soundDaytime);

	String pxVobSoundDaytimeSoundName2(PxVobSoundDaytime soundDaytime);

	String pxVobTriggerGetTarget(PxVobTrigger trigger);

	byte pxVobTriggerGetFlags(PxVobTrigger trigger);

	byte pxVobTriggerGetFilterFlags(PxVobTrigger trigger);

	String pxVobTriggerGetVobTarget(PxVobTrigger trigger);

	int pxVobTriggerGetMaxActivationCount(PxVobTrigger trigger);

	float pxVobTriggerGetRetriggerDelaySec(PxVobTrigger trigger);

	float pxVobTriggerGetDamageThreshold(PxVobTrigger trigger);

	float pxVobTriggerGetFireDelaySec(PxVobTrigger trigger);

	float pxVobTriggerGetSNextTimeTriggerable(PxVobTrigger trigger);

	int pxVobTriggerGetSCountCanBeActivated(PxVobTrigger trigger);

	boolean pxVobTriggerGetSIsEnabled(PxVobTrigger trigger);

	int pxVobTriggerMoverGetBehaviour(PxVobTriggerMover trigger);

	float pxVobTriggerMoverGetTouchBlockerDamage(PxVobTriggerMover trigger);

	float pxVobTriggerMoverGetStayOpenTimeSec(PxVobTriggerMover trigger);

	boolean pxVobTriggerMoverGetLocked(PxVobTriggerMover trigger);

	boolean pxVobTriggerMoverGetAutoLink(PxVobTriggerMover trigger);

	boolean pxVobTriggerMoverGetAutoRotate(PxVobTriggerMover trigger);

	float pxVobTriggerMoverGetSpeed(PxVobTriggerMover trigger);

	int pxVobTriggerMoverGetLerpMode(PxVobTriggerMover trigger);

	int pxVobTriggerMoverGetSpeedMode(PxVobTriggerMover trigger);

	int pxVobTriggerMoverGetKeyframeCount(PxVobTriggerMover trigger);

	void pxVobTriggerMoverGetKeyframe(PxVobTriggerMover trigger, int i, PxVec3 position, PxQuat rotation);

	String pxVobTriggerMoverGetSfxOpenStart(PxVobTriggerMover trigger);

	String pxVobTriggerMoverGetSfxOpenEnd(PxVobTriggerMover trigger);

	String pxVobTriggerMoverGetSfxTransitioning(PxVobTriggerMover trigger);

	String pxVobTriggerMoverGetSfxCloseStart(PxVobTriggerMover trigger);

	String pxVobTriggerMoverGetSfxCloseEnd(PxVobTriggerMover trigger);

	String pxVobTriggerMoverGetSfxLock(PxVobTriggerMover trigger);

	String pxVobTriggerMoverGetSfxUnlock(PxVobTriggerMover trigger);

	String pxVobTriggerMoverGetSfxUseLocked(PxVobTriggerMover trigger);

	PxVec3 pxVobTriggerMoverGetSActKeyPosDelta(PxVobTriggerMover trigger);

	float pxVobTriggerMoverGetSActKeyframeF(PxVobTriggerMover trigger);

	int pxVobTriggerMoverGetSActKeyframe(PxVobTriggerMover trigger);

	int pxVobTriggerMoverGetSNextKeyFrame(PxVobTriggerMover trigger);

	float pxVobTriggerMoverGetMoveSpeedUnit(PxVobTriggerMover trigger);

	float pxVobTriggerMoverGetSAdvanceDir(PxVobTriggerMover trigger);

	int pxVobTriggerMoverGetSMoverState(PxVobTriggerMover trigger);

	int pxVobTriggerMoverGetSTriggerEventCount(PxVobTriggerMover trigger);

	float pxVobTriggerMoverGetSStayOpenTimeDest(PxVobTriggerMover trigger);

	int pxVobTriggerListGetTriggerBatchMode(PxVobTriggerList trigger);

	int pxVobTriggerListGetTargetsCount(PxVobTriggerList trigger);

	String pxVobTriggerListGetTargetName(PxVobTriggerList trigger, int i);

	float pxVobTriggerListGetTargetDelay(PxVobTriggerList trigger, int i);

	byte pxVobTriggerListGetSActTarget(PxVobTriggerList trigger);

	boolean pxVobTriggerListGetSSendOnTrigger(PxVobTriggerList trigger);

	String pxVobTriggerScriptGetFunction(PxVobTriggerScript trigger);

	String pxVobTriggerChangeLevelGetLevelName(PxVobTriggerChangeLevel trigger);

	String pxVobTriggerChangeLevelGetStartVob(PxVobTriggerChangeLevel trigger);

	String pxVobTriggerWorldStartGetTarget(PxVobTriggerWorldStart trigger);

	boolean pxVobTriggerWorldStartGetFireOnce(PxVobTriggerWorldStart trigger);

	boolean pxVobTriggerWorldStartGetSHasFired(PxVobTriggerWorldStart trigger);

	String pxVobTriggerUntouchGetTarget(PxVobTriggerUntouch trigger);

	void pxWorldVobGetZoneMusic(PxVobZoneMusic zoneMusic, boolean[] enabled, int[] priority, boolean[] ellipsoid,
								float[] reverb, float[] volume, boolean[] loop);

	void pxWorldVobGetZoneFarPlane(PxVobZoneFarPlane zoneFarPlane, float[] vob_far_plane_z,
								   float[] inner_range_percentage);

	void pxWorldVobGetZoneFog(PxVobZoneFog zoneFog, float[] range_center, float[] inner_range_percentage, PxColor color,
							  boolean[] fade_out_sky, boolean[] override_color);

	interface LoggingFunc extends Callback {
		void invoke(int level, String message);
	}

	interface PxVmExternalCallback extends Callback {
		void invoke(PxVm vm);
	}

	interface PxVmExternalDefaultCallback extends Callback {
		void invoke(PxVm vm, String name);
	}

	interface PxDaedalusEnumerateCallback extends Callback {
		boolean invoke(PxDaedalusScript script, PxDaedalusSymbol symbol);
	}

	interface PxVmEnumerateInstancesCallback extends Callback {
		void invoke(String symbol);
	}
}
