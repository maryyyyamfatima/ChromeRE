package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zr2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3337Zr2 implements Callback {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ Tab g;
    public final /* synthetic */ Class h;
    public final /* synthetic */ String i;

    public /* synthetic */ C3337Zr2(Callback callback, Tab tab, Class cls, String str) {
        this.a = callback;
        this.g = tab;
        this.h = cls;
        this.i = str;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        AbstractC4368cs2 abstractC4368cs2 = (AbstractC4368cs2) obj;
        final Tab tab = this.g;
        final Class cls = this.h;
        final String str = this.i;
        if (abstractC4368cs2 != null && abstractC4368cs2.j()) {
            this.a.onResult(new Callback() { // from class: as2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    AbstractC4368cs2 abstractC4368cs22 = (AbstractC4368cs2) obj2;
                    if (abstractC4368cs22 != null) {
                        abstractC4368cs22.i = System.currentTimeMillis();
                    }
                    AbstractC4368cs2.k(cls, str, Tab.this, abstractC4368cs22);
                }
            });
        } else {
            AbstractC4368cs2.k(cls, str, tab, abstractC4368cs2);
        }
    }
}
