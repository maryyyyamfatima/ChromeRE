package defpackage;

import android.util.Property;
import org.chromium.chrome.browser.logo.LogoView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AI1 extends Property {
    public final /* synthetic */ LogoView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AI1(LogoView logoView) {
        super(Float.class, "");
        this.a = logoView;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((LogoView) obj).r);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        LogoView logoView = (LogoView) obj;
        Float f = (Float) obj2;
        if (logoView.r != f.floatValue()) {
            logoView.r = f.floatValue();
            this.a.invalidate();
        }
    }
}
