package defpackage;

import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IL2 extends GL2 {
    public IL2(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: ".concat(String.valueOf(obj.getClass())));
    }

    public IL2(Object obj, List list) {
        super(IR0.a("Found ModelLoaders for model class: ", String.valueOf(list), ", but none that handle this specific model instance: ", String.valueOf(obj)));
    }

    public IL2(Class cls, Class cls2) {
        super(IR0.a("Failed to find any ModelLoaders for model: ", String.valueOf(cls), " and data: ", String.valueOf(cls2)));
    }
}
