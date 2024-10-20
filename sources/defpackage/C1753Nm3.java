package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nm3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1753Nm3 extends AbstractC7754mk {
    @Override // defpackage.AbstractC7754mk
    public final void d(Object obj) {
        ((InputStream) obj).close();
    }

    public C1753Nm3(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.AbstractC7754mk
    public final Object f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        return InputStream.class;
    }
}
