package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.chromium.chrome.browser.toolbar.top.ToolbarControlContainer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nQ3 */
/* loaded from: classes2.dex */
public final class C7992nQ3 implements GC {
    public ViewOnLayoutChangeListenerC7648mQ3 a;
    public final /* synthetic */ C9707sQ3 g;

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void k(int i) {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View$OnLayoutChangeListener, mQ3] */
    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        C9707sQ3 c9707sQ3 = this.g;
        Drawable background = c9707sQ3.l.getBackground();
        ToolbarControlContainer toolbarControlContainer = c9707sQ3.l;
        if (background == null) {
            int i4 = ((CC) c9707sQ3.V).n;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbarControlContainer.getLayoutParams();
            if (marginLayoutParams.topMargin == i4) {
                return;
            }
            marginLayoutParams.topMargin = i4;
            toolbarControlContainer.setLayoutParams(marginLayoutParams);
            return;
        }
        if (this.a == null) {
            ?? r1 = new View.OnLayoutChangeListener() { // from class: mQ3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                    C7992nQ3 c7992nQ3 = C7992nQ3.this;
                    C9707sQ3 c9707sQ32 = c7992nQ3.g;
                    if (c9707sQ32.l.getBackground() == null) {
                        int i13 = ((CC) c9707sQ32.V).n;
                        ToolbarControlContainer toolbarControlContainer2 = c9707sQ32.l;
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) toolbarControlContainer2.getLayoutParams();
                        if (marginLayoutParams2.topMargin != i13) {
                            marginLayoutParams2.topMargin = i13;
                            toolbarControlContainer2.setLayoutParams(marginLayoutParams2);
                        }
                        toolbarControlContainer2.removeOnLayoutChangeListener(c7992nQ3.a);
                        c7992nQ3.a = null;
                    }
                }
            };
            this.a = r1;
            toolbarControlContainer.addOnLayoutChangeListener(r1);
        }
    }

    public C7992nQ3(C9707sQ3 c9707sQ3) {
        this.g = c9707sQ3;
    }
}
