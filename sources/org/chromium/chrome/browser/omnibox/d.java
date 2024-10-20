package org.chromium.chrome.browser.omnibox;

import android.util.Property;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class d extends Property {
    public final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar) {
        super(Float.class, "");
        this.a = gVar;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((LocationBarTablet) this.a.h).z);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((LocationBarTablet) this.a.h).g(((Float) obj2).floatValue());
    }
}
