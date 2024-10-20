package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8313oM0 extends AbstractC7754mk {
    @Override // defpackage.AbstractC7754mk
    public final void d(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    public C8313oM0(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.AbstractC7754mk
    public final Object f(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        return AssetFileDescriptor.class;
    }
}
