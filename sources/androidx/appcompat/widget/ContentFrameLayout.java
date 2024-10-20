package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.BS1;
import defpackage.C4097c5;
import defpackage.C6349ie4;
import defpackage.C7380lf;
import defpackage.InterfaceC3030Xi0;
import defpackage.LayoutInflaterFactory2C0545Ef;
import defpackage.V4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue a;
    public TypedValue g;
    public TypedValue h;
    public TypedValue i;
    public TypedValue j;
    public TypedValue k;
    public final Rect l;
    public C7380lf m;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.l = new Rect();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7380lf c7380lf = this.m;
        if (c7380lf != null) {
            c7380lf.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C4097c5 c4097c5;
        super.onDetachedFromWindow();
        C7380lf c7380lf = this.m;
        if (c7380lf != null) {
            LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = c7380lf.a;
            InterfaceC3030Xi0 interfaceC3030Xi0 = layoutInflaterFactory2C0545Ef.q;
            if (interfaceC3030Xi0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC3030Xi0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = actionBarOverlayLayout.j.a.a;
                if (actionMenuView != null && (c4097c5 = actionMenuView.y) != null) {
                    c4097c5.b();
                    V4 v4 = c4097c5.y;
                    if (v4 != null && v4.b()) {
                        v4.j.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0545Ef.v != null) {
                layoutInflaterFactory2C0545Ef.k.getDecorView().removeCallbacks(layoutInflaterFactory2C0545Ef.w);
                if (layoutInflaterFactory2C0545Ef.v.isShowing()) {
                    try {
                        layoutInflaterFactory2C0545Ef.v.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0545Ef.v = null;
            }
            C6349ie4 c6349ie4 = layoutInflaterFactory2C0545Ef.x;
            if (c6349ie4 != null) {
                c6349ie4.b();
            }
            BS1 bs1 = layoutInflaterFactory2C0545Ef.z(0).h;
            if (bs1 != null) {
                bs1.c(true);
            }
        }
    }
}
