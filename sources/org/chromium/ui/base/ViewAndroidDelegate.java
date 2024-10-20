package org.chromium.ui.base;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC10430uY0;
import defpackage.C0201Bo0;
import defpackage.C10554ut0;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.InterfaceC4274cc4;
import defpackage.InterfaceViewOnDragListenerC0226Bt0;
import java.util.Iterator;
import org.chromium.content.browser.GestureListenerManagerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ViewAndroidDelegate {
    public final ViewGroup b;
    public C0201Bo0 f;
    public boolean g;
    public final int[] c = new int[2];
    public final C12157za2 d = new C12157za2();
    public final C12157za2 e = new C12157za2();
    public final C10554ut0 a = new C10554ut0();

    public InterfaceViewOnDragListenerC0226Bt0 a() {
        return null;
    }

    public int[] getDisplayFeature() {
        return null;
    }

    public int getViewportInsetBottom() {
        return 0;
    }

    public void onBackgroundColorChanged(int i) {
    }

    public void onBottomControlsChanged(int i, int i2) {
    }

    public void onTopControlsChanged(int i, int i2, int i3) {
    }

    public ViewAndroidDelegate(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public View acquireView() {
        ViewGroup viewGroup = this.b;
        if (viewGroup == null || viewGroup.getParent() == null) {
            return null;
        }
        View view = new View(viewGroup.getContext());
        viewGroup.addView(view);
        return view;
    }

    public void removeView(View view) {
        ViewGroup viewGroup = this.b;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    public void setViewPosition(View view, float f, float f2, float f3, float f4, int i, int i2) {
        ViewGroup viewGroup = this.b;
        if (viewGroup == null) {
            return;
        }
        int round = Math.round(f3);
        int round2 = Math.round(f4);
        if (viewGroup.getLayoutDirection() == 1) {
            i = viewGroup.getMeasuredWidth() - Math.round(f3 + f);
        }
        if (round + i > viewGroup.getWidth()) {
            round = viewGroup.getWidth() - i;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = round;
        marginLayoutParams.height = round2;
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x032b, code lost:            if ((!org.chromium.url.GURL.l(r23.b)) != false) goto L710;     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean startDragAndDrop(android.graphics.Bitmap r22, org.chromium.ui.dragdrop.DropDataAndroid r23) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.ui.base.ViewAndroidDelegate.startDragAndDrop(android.graphics.Bitmap, org.chromium.ui.dragdrop.DropDataAndroid):boolean");
    }

    public void onCursorChangedToCustom(Bitmap bitmap, int i, int i2) {
        PointerIcon create;
        if (Build.VERSION.SDK_INT >= 24) {
            create = PointerIcon.create(bitmap, i, i2);
            this.b.setPointerIcon(create);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCursorChanged(int r5) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L7
            return
        L7:
            boolean r1 = r4.g
            r2 = 0
            android.view.ViewGroup r3 = r4.b
            if (r1 == 0) goto L27
            Bo0 r1 = r4.f
            if (r1 == 0) goto L27
            r1 = 31
            if (r0 >= r1) goto L18
            r0 = r2
            goto L24
        L18:
            android.content.Context r0 = r3.getContext()
            android.view.PointerIcon r0 = defpackage.AbstractC11553xo0.a(r0)
            defpackage.AbstractC11143wd.a(r3, r0)
            r0 = 1
        L24:
            if (r0 == 0) goto L27
            return
        L27:
            r0 = 45
            if (r5 == r0) goto L6e
            switch(r5) {
                case 1: goto L6b;
                case 2: goto L68;
                case 3: goto L65;
                case 4: goto L62;
                case 5: goto L5f;
                case 6: goto L5c;
                case 7: goto L59;
                case 8: goto L56;
                case 9: goto L53;
                case 10: goto L59;
                case 11: goto L53;
                case 12: goto L56;
                case 13: goto L5c;
                case 14: goto L59;
                case 15: goto L5c;
                case 16: goto L56;
                case 17: goto L53;
                case 18: goto L5c;
                case 19: goto L59;
                case 20: goto L50;
                default: goto L2e;
            }
        L2e:
            switch(r5) {
                case 29: goto L50;
                case 30: goto L4d;
                case 31: goto L4a;
                case 32: goto L47;
                case 33: goto L44;
                case 34: goto L62;
                case 35: goto L41;
                case 36: goto L3e;
                case 37: goto L70;
                case 38: goto L41;
                case 39: goto L3b;
                case 40: goto L38;
                case 41: goto L35;
                case 42: goto L32;
                default: goto L31;
            }
        L31:
            goto L6e
        L32:
            r2 = 1021(0x3fd, float:1.431E-42)
            goto L70
        L35:
            r2 = 1020(0x3fc, float:1.43E-42)
            goto L70
        L38:
            r2 = 1019(0x3fb, float:1.428E-42)
            goto L70
        L3b:
            r2 = 1018(0x3fa, float:1.427E-42)
            goto L70
        L3e:
            r2 = 1011(0x3f3, float:1.417E-42)
            goto L70
        L41:
            r2 = 1012(0x3f4, float:1.418E-42)
            goto L70
        L44:
            r2 = 1010(0x3f2, float:1.415E-42)
            goto L70
        L47:
            r2 = 1001(0x3e9, float:1.403E-42)
            goto L70
        L4a:
            r2 = 1006(0x3ee, float:1.41E-42)
            goto L70
        L4d:
            r2 = 1009(0x3f1, float:1.414E-42)
            goto L70
        L50:
            r2 = 1013(0x3f5, float:1.42E-42)
            goto L70
        L53:
            r2 = 1017(0x3f9, float:1.425E-42)
            goto L70
        L56:
            r2 = 1016(0x3f8, float:1.424E-42)
            goto L70
        L59:
            r2 = 1015(0x3f7, float:1.422E-42)
            goto L70
        L5c:
            r2 = 1014(0x3f6, float:1.421E-42)
            goto L70
        L5f:
            r2 = 1003(0x3eb, float:1.406E-42)
            goto L70
        L62:
            r2 = 1004(0x3ec, float:1.407E-42)
            goto L70
        L65:
            r2 = 1008(0x3f0, float:1.413E-42)
            goto L70
        L68:
            r2 = 1002(0x3ea, float:1.404E-42)
            goto L70
        L6b:
            r2 = 1007(0x3ef, float:1.411E-42)
            goto L70
        L6e:
            r2 = 1000(0x3e8, float:1.401E-42)
        L70:
            android.content.Context r5 = r3.getContext()
            android.view.PointerIcon r5 = defpackage.AbstractC3931bc4.a(r5, r2)
            defpackage.AbstractC11143wd.a(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.ui.base.ViewAndroidDelegate.onCursorChanged(int):void");
    }

    public final void setHoverActionStylusWritable(boolean z) {
        this.g = z;
    }

    public final View getContainerView() {
        return this.b;
    }

    public final int getXLocationOfContainerViewInWindow() {
        View containerView = getContainerView();
        if (containerView == null) {
            return 0;
        }
        int[] iArr = this.c;
        containerView.getLocationInWindow(iArr);
        return iArr[0];
    }

    public final int getYLocationOfContainerViewInWindow() {
        View containerView = getContainerView();
        if (containerView == null) {
            return 0;
        }
        int[] iArr = this.c;
        containerView.getLocationInWindow(iArr);
        return iArr[1];
    }

    public final int getXLocationOnScreen() {
        View containerView = getContainerView();
        if (containerView == null) {
            return 0;
        }
        int[] iArr = this.c;
        containerView.getLocationOnScreen(iArr);
        return iArr[0];
    }

    public final int getYLocationOnScreen() {
        View containerView = getContainerView();
        if (containerView == null) {
            return 0;
        }
        int[] iArr = this.c;
        containerView.getLocationOnScreen(iArr);
        return iArr[1];
    }

    public final void requestDisallowInterceptTouchEvent() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void requestUnbufferedDispatch(MotionEvent motionEvent) {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                if (motionEvent.getToolType(i) == 2) {
                    return;
                }
            }
            viewGroup.requestUnbufferedDispatch(motionEvent);
        }
    }

    public final boolean hasFocus() {
        View containerView = getContainerView();
        if (containerView == null) {
            return false;
        }
        if (containerView.isInTouchMode() ? containerView.isFocusableInTouchMode() : containerView.isFocusable()) {
            return containerView.hasFocus();
        }
        return true;
    }

    public final void requestFocus() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            if (!(viewGroup.isInTouchMode() ? viewGroup.isFocusableInTouchMode() : viewGroup.isFocusable()) || viewGroup.isFocused()) {
                return;
            }
            viewGroup.requestFocus();
        }
    }

    public void onVerticalScrollDirectionChanged(boolean z, float f) {
        Iterator it = this.e.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            C11814ya2 c11814ya22 = ((GestureListenerManagerImpl) ((InterfaceC4274cc4) c11814ya2.next())).h;
            c11814ya22.b();
            while (c11814ya22.hasNext()) {
                ((AbstractC10430uY0) c11814ya22.next()).g(z);
            }
        }
    }
}
