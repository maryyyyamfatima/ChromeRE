package com.google.android.libraries.search.rendering.xuikit.runtime.resourceloader;

import com.google.android.libraries.elements.interfaces.ControllerModuleLoader;
import defpackage.AbstractC0087Ar1;
import io.grpc.Status;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"Lcom/google/android/libraries/search/rendering/xuikit/runtime/resourceloader/FailingControllerModuleLoader;", "Lcom/google/android/libraries/elements/interfaces/ControllerModuleLoader;", "()V", "loadModule", "Lio/grpc/Status;", "moduleConfigProto", "", "moduleDependencies", "Ljava/util/ArrayList;", "", "java.com.google.android.libraries.search.rendering.xuikit.runtime.resourceloader_resourceloader"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FailingControllerModuleLoader extends ControllerModuleLoader {
    @Override // com.google.android.libraries.elements.interfaces.ControllerModuleLoader
    public Status loadModule(byte[] moduleConfigProto, ArrayList moduleDependencies) {
        Status status = Status.e;
        AbstractC0087Ar1.d(status, "UNKNOWN");
        return status;
    }
}
