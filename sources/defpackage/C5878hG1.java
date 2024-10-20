package defpackage;

import android.util.Property;
import org.chromium.chrome.browser.omnibox.g;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hG1 */
/* loaded from: classes.dex */
public final class C5878hG1 extends Property {
    public final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5878hG1(g gVar) {
        super(Float.class, "");
        this.a = gVar;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(this.a.L);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        this.a.a0(((Float) obj2).floatValue());
    }
}
