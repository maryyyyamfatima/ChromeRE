package defpackage;

import com.google.protobuf.BaseGeneratedExtensionRegistryLite$Loader;
import defpackage.C10582uy0;
import defpackage.XF0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class GX0 {
    public static /* synthetic */ Iterator a() {
        try {
            return Arrays.asList(new HX0() { // from class: com.google.protobuf.ElementsGeneratedExtensionRegistryLite$Loader
                @Override // defpackage.HX0
                public final XF0 a() {
                    return new C10582uy0();
                }
            }, new BaseGeneratedExtensionRegistryLite$Loader()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
