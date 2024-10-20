package com.google.chrome.elements;

import J.N;
import com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader;
import com.google.protobuf.ElementsGeneratedExtensionRegistryLite$Loader;
import defpackage.C0661Fc0;
import defpackage.C0900Gy;
import defpackage.C1421Ky0;
import defpackage.C4341co;
import defpackage.C7928nE;
import defpackage.HX0;
import defpackage.InterfaceC12198zh1;
import defpackage.UN;
import defpackage.WB2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ElementsProcessScopeWrapper {
    public static C1421Ky0 createElementsProcessScope(WB2 wb2) {
        if (BlazeGeneratedExtensionRegistryLiteLoader.b == null) {
            BlazeGeneratedExtensionRegistryLiteLoader.b = new C0661Fc0();
        }
        C0661Fc0 c0661Fc0 = BlazeGeneratedExtensionRegistryLiteLoader.b;
        c0661Fc0.getClass();
        try {
            c0661Fc0.e.put(ElementsGeneratedExtensionRegistryLite$Loader.class, ((HX0) ElementsGeneratedExtensionRegistryLite$Loader.class.getConstructor(new Class[0]).newInstance(new Object[0])).a());
            C1421Ky0 c1421Ky0 = new C1421Ky0(wb2);
            C1421Ky0.c = (InterfaceC12198zh1) c1421Ky0.a.e.get();
            C7928nE c7928nE = UN.a;
            C1421Ky0.d = new C4341co(N.M37SqSAy("FeedImageMemoryCacheSizePercentage", "image_memory_cache_size_percentage", 100), N.M37SqSAy("FeedImageMemoryCacheSizePercentage", "bitmap_pool_size_percentage", 100));
            return c1421Ky0;
        } catch (ReflectiveOperationException e) {
            throw new C0900Gy(e);
        }
    }
}
