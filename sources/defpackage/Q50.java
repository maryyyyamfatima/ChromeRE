package defpackage;

import J.N;
import android.R;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.chromium.base.TraceEvent;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.SmartClipProvider;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.EventForwarder;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Q50 extends FrameLayout implements Pc4, SmartClipProvider, ViewGroup.OnHierarchyChangeListener, View.OnSystemUiVisibilityChangeListener, View.OnDragListener {
    public static final int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    public final WebContents a;
    public final C12157za2 g;
    public final C12157za2 h;
    public final C12157za2 i;
    public Tc4 j;
    public int k;
    public int l;
    public final C9296rD0 m;

    @Override // android.view.View
    public final boolean performLongClick() {
        return false;
    }

    public Q50(Context context, WebContents webContents) {
        super(context, null, R.attr.webViewStyle);
        this.g = new C12157za2();
        this.h = new C12157za2();
        this.i = new C12157za2();
        int i = n;
        this.k = i;
        this.l = i;
        if (getScrollBarStyle() == 0) {
            setHorizontalScrollBarEnabled(false);
            setVerticalScrollBarEnabled(false);
        }
        this.a = webContents;
        this.m = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        super.setOnHierarchyChangeListener(this);
        super.setOnSystemUiVisibilityChangeListener(this);
        super.setOnDragListener(this);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        g();
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        super.setOnHierarchyChangeListener(onHierarchyChangeListener);
    }

    @Override // android.view.View
    public final void setOnSystemUiVisibilityChangeListener(View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
        super.setOnSystemUiVisibilityChangeListener(onSystemUiVisibilityChangeListener);
    }

    @Override // android.view.View
    public final void setOnDragListener(View.OnDragListener onDragListener) {
        super.setOnDragListener(onDragListener);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((ViewGroup.OnHierarchyChangeListener) c11814ya2.next()).onChildViewRemoved(view, view2);
            }
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((ViewGroup.OnHierarchyChangeListener) c11814ya2.next()).onChildViewAdded(view, view2);
            }
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        Iterator it = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((View.OnSystemUiVisibilityChangeListener) c11814ya2.next()).onSystemUiVisibilityChange(i);
            }
        }
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        Iterator it = this.i.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return false;
            }
            ((View.OnDragListener) c11814ya2.next()).onDrag(view, dragEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.k;
        int i4 = n;
        if (i3 != i4) {
            i = i3;
        }
        int i5 = this.l;
        if (i5 != i4) {
            i2 = i5;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final AccessibilityNodeProvider getAccessibilityNodeProvider() {
        WebContentsAccessibilityImpl g = g();
        AccessibilityNodeProvider o = g != null ? g.o() : null;
        return o != null ? o : super.getAccessibilityNodeProvider();
    }

    @Override // android.view.View, defpackage.Pc4
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x013a, code lost:            if ((r12 & 1024) != 0) goto L866;     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0278  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r21) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q50.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        int i;
        if (h() && (i = ImeAdapterImpl.b(this.a).o) != 0) {
            return !(i == 8 || i == 12 || i == 9 || i == 10 || i == 11 || i == 13);
        }
        return false;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (h()) {
            ((Tc4) f()).f(z);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        EventForwarder d = d();
        if (d == null) {
            return false;
        }
        long j = d.b;
        if (j == 0) {
            return false;
        }
        return N.MRbfSEI1(j, d, keyEvent, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        EventForwarder d = d();
        if (d == null) {
            return false;
        }
        long j = d.b;
        if (j == 0) {
            return false;
        }
        return N.MZE$0qqv(j, d, keyEvent);
    }

    @Override // android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        EventForwarder d = d();
        if (d == null || d.b == 0 || Build.VERSION.SDK_INT <= 23) {
            return false;
        }
        ClipDescription clipDescription = dragEvent.getClipDescription();
        String[] filterMimeTypes = clipDescription == null ? new String[0] : clipDescription.filterMimeTypes("text/*");
        String[] filterMimeTypes2 = filterMimeTypes == null ? clipDescription.filterMimeTypes("image/*") : filterMimeTypes;
        if (dragEvent.getAction() == 1) {
            if (filterMimeTypes2 == null || filterMimeTypes2.length <= 0 || !d.a) {
                return false;
            }
        } else {
            StringBuilder sb = new StringBuilder("");
            if (dragEvent.getAction() == 3) {
                ClipData clipData = dragEvent.getClipData();
                int itemCount = clipData.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    sb.append(clipData.getItemAt(i).coerceToStyledText(getContext()));
                }
            }
            getLocationOnScreen(new int[2]);
            float x = dragEvent.getX() + d.c;
            float y = dragEvent.getY() + d.d;
            float b = d.b();
            N.MZ1ZkPta(d.b, d, dragEvent.getAction(), x / b, y / b, (r3[0] + x) / b, (r3[1] + y) / b, filterMimeTypes2, sb.toString());
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        C9296rD0 c9296rD0 = this.m;
        if (c9296rD0 != null) {
            c9296rD0.a(motionEvent, false);
        }
        return onInterceptTouchEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:            if ((r5 != null && r5.d(r3.C().getContainerView(), r1)) != false) goto L627;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x021d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r44) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q50.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        C9296rD0 c9296rD0 = this.m;
        if (c9296rD0 != null) {
            c9296rD0.a(motionEvent, true);
        }
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchDragEvent(DragEvent dragEvent) {
        int action;
        C9296rD0 c9296rD0 = this.m;
        if (c9296rD0 != null) {
            dragEvent.getAction();
            C10948w20 c10948w20 = c9296rD0.a;
            C9897sy1 c9897sy1 = c10948w20.b.k;
            RectF rectF = c10948w20.a;
            if (c9897sy1 != null) {
                c9897sy1.A(rectF);
            }
            c9296rD0.b(-rectF.top);
        }
        boolean dispatchDragEvent = super.dispatchDragEvent(dragEvent);
        if (c9296rD0 != null && ((action = dragEvent.getAction()) == 6 || action == 4 || action == 3)) {
            c9296rD0.b(0.0f);
        }
        return dispatchDragEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHoverEvent(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q50.onHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        EventForwarder d = d();
        if (d != null) {
            return d.d(motionEvent);
        }
        return false;
    }

    public final Qc4 f() {
        if (this.j == null && h()) {
            this.j = Tc4.c(this.a);
        }
        return this.j;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        if (h()) {
            WebContentsImpl webContentsImpl = ((Tc4) f()).a;
            try {
                TraceEvent.b("ViewEventSink.onConfigurationChanged", null);
                Iterator it = C10191tp4.e(webContentsImpl).a.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        break;
                    } else {
                        ((InterfaceC9163qp4) c11814ya2.next()).onConfigurationChanged(configuration);
                    }
                }
                ViewAndroidDelegate C = webContentsImpl.C();
                if (C != null) {
                    C.getContainerView().requestLayout();
                }
            } finally {
                TraceEvent.c("ViewEventSink.onConfigurationChanged");
            }
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        EventForwarder d = d();
        if (d != null) {
            float f = i;
            float f2 = i2;
            long j = d.b;
            if (j == 0) {
                return;
            }
            N.MMwH$VBb(j, d, f, f2);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        EventForwarder d = d();
        if (d != null) {
            float f = i;
            float f2 = i2;
            long j = d.b;
            if (j == 0) {
                return;
            }
            N.M6lTZ5w8(j, d, f, f2);
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        if (e() != null) {
            return (int) Math.ceil(r0.a(r0.e));
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        if (e() != null) {
            return (int) Math.floor(r0.a(r0.a));
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        if (e() != null) {
            return (int) Math.ceil(r0.a(r0.c));
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        C6600jN2 e = e();
        if (e != null) {
            return e.b();
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        C6600jN2 e = e();
        if (e != null) {
            return e.c();
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        if (e() != null) {
            return (int) Math.ceil(r0.a(r0.d));
        }
        return 0;
    }

    public final C6600jN2 e() {
        if (h()) {
            return ((WebContentsImpl) this.a).m;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean awakenScrollBars(int i, boolean z) {
        if (getScrollBarStyle() == 0) {
            return false;
        }
        return super.awakenScrollBars(i, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!h()) {
            return;
        }
        C10191tp4 e = C10191tp4.e(((Tc4) f()).a);
        e.i = true;
        e.d();
        Iterator it = e.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC9163qp4) c11814ya2.next()).onAttachedToWindow();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewAndroidDelegate C;
        WindowAndroid windowAndroid;
        super.onDetachedFromWindow();
        if (h()) {
            WebContentsImpl webContentsImpl = ((Tc4) f()).a;
            C10191tp4 e = C10191tp4.e(webContentsImpl);
            WindowAndroid windowAndroid2 = e.g;
            if (windowAndroid2 != null) {
                windowAndroid2.i.a.remove(e);
            }
            if (e.i && (windowAndroid = e.g) != null) {
                windowAndroid.w.d(e.h);
            }
            e.i = false;
            Iterator it = e.a.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((InterfaceC9163qp4) c11814ya2.next()).onDetachedFromWindow();
                }
            }
            if (webContentsImpl.l == null || (C = webContentsImpl.C()) == null) {
                return;
            }
            webContentsImpl.l.f(C.getContainerView().getContext());
        }
    }

    @Override // org.chromium.content_public.browser.SmartClipProvider
    public final void extractSmartClipData(int i, int i2, int i3, int i4) {
        if (h()) {
            this.a.M(i, i2, i3, i4);
        }
    }

    @Override // org.chromium.content_public.browser.SmartClipProvider
    public final void setSmartClipResultHandler(Handler handler) {
        if (h()) {
            this.a.setSmartClipResultHandler(handler);
        }
    }

    @Override // android.view.View
    public final void onProvideVirtualStructure(ViewStructure viewStructure) {
        WebContentsAccessibilityImpl g = g();
        if (g != null) {
            g.w(viewStructure);
        }
    }

    @Override // defpackage.Pc4
    public final boolean c(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.Pc4
    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.Pc4
    public final boolean b(MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    public final boolean h() {
        WebContents webContents = this.a;
        return (webContents == null || webContents.isDestroyed()) ? false : true;
    }

    public final EventForwarder d() {
        boolean h = h();
        WebContents webContents = this.a;
        if (h && webContents.Q0() != null) {
            return webContents.r0();
        }
        return null;
    }

    public final WebContentsAccessibilityImpl g() {
        boolean h = h();
        WebContents webContents = this.a;
        if (h && webContents.Q0() != null) {
            return WebContentsAccessibilityImpl.k(webContents);
        }
        return null;
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            TraceEvent.b("ContentView.onFocusChanged", null);
            super.onFocusChanged(z, i, rect);
            if (h()) {
                ((Tc4) f()).j = true;
                Tc4 tc4 = (Tc4) f();
                Boolean bool = tc4.g;
                if (bool == null || bool.booleanValue() != z) {
                    tc4.g = Boolean.valueOf(z);
                    tc4.e();
                    InterfaceC12242zo3 interfaceC12242zo3 = tc4.a.l;
                    if (interfaceC12242zo3 != null) {
                        interfaceC12242zo3.a(z);
                    }
                }
            }
        } finally {
            TraceEvent.c("ContentView.onFocusChanged");
        }
    }
}
