package org.chromium.chrome.browser.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.C0565Ej;
import defpackage.C8385oa2;
import defpackage.CC;
import defpackage.FB;
import defpackage.GC;
import defpackage.InterfaceC7697ma2;
import defpackage.JC;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ui.BottomContainer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BottomContainer extends FrameLayout implements GC {
    public final FB a;
    public JC g;
    public C0565Ej h;
    public InterfaceC7697ma2 i;
    public float j;

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void r() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [FB] */
    public BottomContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Callback() { // from class: FB
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                BottomContainer bottomContainer = BottomContainer.this;
                bottomContainer.setTranslationY(bottomContainer.j);
            }
        };
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        setTranslationY(this.j);
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        this.j = f;
        super.setTranslationY(this.j + (((((CC) this.g).e() - ((CC) this.g).o) - ((Integer) this.h.g).intValue()) - ((Integer) ((C8385oa2) this.i).g).intValue()));
    }

    @Override // defpackage.GC
    public final void k(int i) {
        setTranslationY(this.j);
    }
}
