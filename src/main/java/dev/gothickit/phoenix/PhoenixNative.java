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

	PxVdf pxVdfNew(String comment);

	PxVdf pxVdfLoad(PxBuffer buffer);

	PxVdf pxVdfLoadFromFile(String file);

	void pxVdfDestroy(PxVdf vdf);

	void pxVdfMerge(PxVdf vdf, PxVdf other, boolean override);

	Pointer pxVdfGetEntryByName(PxVdf vdf, String name);

	PxBuffer pxVdfEntryOpenBuffer(Pointer entry);

	PxModelAnimation pxManLoad(PxBuffer buffer);

	PxModelAnimation pxManLoadFromVdf(PxVdf vdf, String name);

	void pxManDestroy(PxModelAnimation man);

	String pxManGetName(PxModelAnimation man);

	String pxManGetNext(PxModelAnimation man);

	int pxManGetLayer(PxModelAnimation man);

	int pxManGetFrameCount(PxModelAnimation man);

	int pxManGetNodeCount(PxModelAnimation man);

	float pxManGetFps(PxModelAnimation man);

	PxAABB.ByValue pxManGetBbox(PxModelAnimation man);

	int pxManGetChecksum(PxModelAnimation man);

	void pxManGetSample(PxModelAnimation man, int index, PxVec3 position, PxQuat rotation);

	Pointer pxManGetNodeIndices(PxModelAnimation man, int[] length);

	PxCutsceneLib pxCslLoad(PxBuffer buffer);

	PxCutsceneLib pxCslLoadFromVdf(PxVdf vdf, String name);

	void pxCslDestroy(PxCutsceneLib csl);

	String pxCslGetBlock(PxCutsceneLib csl, String name, int[] type);

	PxDaedalusScript pxScriptLoad(PxBuffer buffer);

	PxDaedalusScript pxScriptLoadFromVdf(PxVdf vdf, String name);

	void pxScriptDestroy(PxDaedalusScript world);

	Pointer pxScriptGetSymbolById(PxDaedalusScript script, int id);

	Pointer pxScriptGetSymbolByName(PxDaedalusScript script, String name);

	PxFont pxFntLoad(PxBuffer buffer);

	PxFont pxFntLoadFromVdf(PxVdf vdf, String name);

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

	PxMesh pxMshLoadFromVdf(PxVdf vdf, String name);

	void pxMshDestroy(PxMesh msh);

	String pxMshGetName(PxMesh msh);

	PxAABB pxMshGetBbox(PxMesh msh);

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

	PxModel pxMdlLoadFromVdf(PxVdf vdf, String name);

	void pxMdlDestroy(PxModel mdl);

	PxModelHierarchy pxMdlGetHierarchy(PxModel mdl);

	PxModelMesh pxMdlGetMesh(PxModel mdl);

	PxModelHierarchy pxMdhLoad(PxBuffer buffer);

	PxModelHierarchy pxMdhLoadFromVdf(PxVdf vdf, String name);

	void pxMdhDestroy(PxModelHierarchy mdl);

	PxAABB.ByValue pxMdhGetBbox(PxModelHierarchy mdh);

	PxAABB.ByValue pxMdhGetCollisionBbox(PxModelHierarchy mdh);

	PxVec3.ByValue pxMdhGetRootTranslation(PxModelHierarchy mdh);

	int pxMdhGetChecksum(PxModelHierarchy mdh);

	int pxMdhGetNodeCount(PxModelHierarchy mdh);

	void pxMdhGetNode(PxModelHierarchy mdh, int index, short[] parent, String[] name);

	PxModelMesh pxMdmLoad(PxBuffer buffer);

	PxModelMesh pxMdmLoadFromVdf(PxVdf vdf, String name);

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

	PxModelScript pxMdsLoadFromVdf(PxVdf vdf, String name);

	void pxMdsDestroy(PxModelScript mds);

	PxMorphMesh pxMmbLoad(PxBuffer buffer);

	PxMorphMesh pxMmbLoadFromVdf(PxVdf vdf, String name);

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

	PxMultiResolutionMesh pxMrmLoadFromVdf(PxVdf vdf, String name);

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

	PxAABB pxMrmGetBbox(PxMultiResolutionMesh mrm);

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

	PxTexture pxTexLoadFromVdf(PxVdf vdf, String name);

	PxTexture pxTexDestroy(PxTexture tex);

	void pxTexGetMeta(PxTexture tex, int[] format, int[] width, int[] height, int[] mipmapCount, int[] averageColor);

	Pointer pxTexGetMipmap(PxTexture tex, int level, int[] width, int[] height);

	PxVm pxVmLoad(PxBuffer buffer);

	PxVm pxVmLoadFromVdf(PxVdf vdf, String name);

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

	PxVmInstance pxVmInstanceAllocate(PxVm vm, String name, int type);

	PxVmInstance pxVmInstanceInitialize(PxVm vm, String name, int type, PxVmInstance existing);

	int pxVmInstanceNpcGetNameLength(PxVmInstance instance);

	String pxVmInstanceNpcGetName(PxVmInstance instance, int i);

	int pxVmInstanceNpcGetRoutine(PxVmInstance instance);

	PxWorld pxWorldLoad(PxBuffer buffer);

	PxWorld pxWorldLoadFromVdf(PxVdf vdf, String name);

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

	interface LoggingFunc extends Callback {
		void invoke(int level, String message);
	}

	interface PxVmExternalCallback extends Callback {
		void invoke(PxVm vm);
	}

	interface PxVmExternalDefaultCallback extends Callback {
		void invoke(PxVm vm, String name);
	}
}
