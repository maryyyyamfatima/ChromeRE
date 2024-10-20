package com.google.android.libraries.search.rendering.xuikit.runtime.resourceloader;

import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import com.google.android.libraries.elements.interfaces.ValidationResult;
import defpackage.AbstractC0087Ar1;
import defpackage.AbstractC6690je3;
import defpackage.C6492j31;
import defpackage.C9754sa0;
import defpackage.Hr4;
import defpackage.InterfaceC5462g31;
import io.grpc.Status;
import kotlin.Metadata;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0014B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0015"}, d2 = {"Lcom/google/android/libraries/search/rendering/xuikit/runtime/resourceloader/CountingResourceLoaderDelegate;", "Lcom/google/android/libraries/elements/interfaces/ResourceLoaderDelegate;", "", "identifier", "Lcom/google/android/libraries/elements/interfaces/ValidationResult;", "validationResult", "Lio/grpc/Status;", "status", "Lp14;", "onResourceProcessed", "", "newServingContext", "onServingContextUpdated", "onResourceCachePrepared", "onAttemptedToCacheResource", "onMissingCacheDependency", "LHr4;", "counters", "<init>", "(LHr4;)V", "sa0", "java.com.google.android.libraries.search.rendering.xuikit.runtime.resourceloader_resourceloader"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CountingResourceLoaderDelegate extends ResourceLoaderDelegate {
    public static final String ON_RESOURCE_PROCESSED_COUNTER = "Runtime.ResourceLoaderDelegate.OnResourceProcessed";
    private final Hr4 counters;
    public static final C9754sa0 Companion = new C9754sa0();
    private static final C6492j31 logger = C6492j31.j();

    public CountingResourceLoaderDelegate(Hr4 hr4) {
        AbstractC0087Ar1.e(hr4, "counters");
        this.counters = hr4;
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public void onResourceProcessed(String str, ValidationResult validationResult, Status status) {
        AbstractC0087Ar1.e(str, "identifier");
        AbstractC0087Ar1.e(validationResult, "validationResult");
        AbstractC0087Ar1.e(status, "status");
        this.counters.a(validationResult.ordinal(), ON_RESOURCE_PROCESSED_COUNTER);
        InterfaceC5462g31 b = logger.b();
        AbstractC6690je3.b(b, "com/google/android/libraries/search/rendering/xuikit/runtime/resourceloader/CountingResourceLoaderDelegate", "onResourceProcessed", 34, "CountingResourceLoaderDelegate.kt").b("onResourceProcessed(\"%s\", %d, %d)", str, Integer.valueOf(validationResult.ordinal()), Integer.valueOf(status.getCode().ordinal()));
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public void onServingContextUpdated(byte[] bArr) {
        AbstractC0087Ar1.e(bArr, "newServingContext");
        AbstractC6690je3.a(logger.b(), "onServingContextUpdated()", "com/google/android/libraries/search/rendering/xuikit/runtime/resourceloader/CountingResourceLoaderDelegate", "onServingContextUpdated", 43, "CountingResourceLoaderDelegate.kt");
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public void onResourceCachePrepared(String str, Status status) {
        AbstractC0087Ar1.e(str, "identifier");
        AbstractC0087Ar1.e(status, "status");
        InterfaceC5462g31 b = logger.b();
        AbstractC6690je3.b(b, "com/google/android/libraries/search/rendering/xuikit/runtime/resourceloader/CountingResourceLoaderDelegate", "onResourceCachePrepared", 47, "CountingResourceLoaderDelegate.kt").c("onResourceCachePrepared(\"%s\", %d)", str, status.getCode().ordinal());
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public void onAttemptedToCacheResource(String str, ValidationResult validationResult, Status status) {
        AbstractC0087Ar1.e(str, "identifier");
        AbstractC0087Ar1.e(validationResult, "validationResult");
        AbstractC0087Ar1.e(status, "status");
        InterfaceC5462g31 b = logger.b();
        AbstractC6690je3.b(b, "com/google/android/libraries/search/rendering/xuikit/runtime/resourceloader/CountingResourceLoaderDelegate", "onAttemptedToCacheResource", 57, "CountingResourceLoaderDelegate.kt").b("onAttemptedToCacheResource(\"%s\", %d, %d)", str, Integer.valueOf(validationResult.ordinal()), Integer.valueOf(status.getCode().ordinal()));
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public void onMissingCacheDependency(String str) {
        AbstractC0087Ar1.e(str, "identifier");
        AbstractC6690je3.b(logger.b(), "com/google/android/libraries/search/rendering/xuikit/runtime/resourceloader/CountingResourceLoaderDelegate", "onMissingCacheDependency", 66, "CountingResourceLoaderDelegate.kt").o(str, "onMissingCacheDependency(\"%s\")");
    }
}
