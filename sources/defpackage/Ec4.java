package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.android.chrome.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Ec4 {
    public static WeakHashMap a;
    public static Field b;
    public static boolean c;
    public static final C5649gc4 d;
    public static final ViewTreeObserverOnGlobalLayoutListenerC7367lc4 e;

    /* JADX WARN: Type inference failed for: r0v3, types: [gc4] */
    static {
        new AtomicInteger(1);
        a = null;
        c = false;
        d = new InterfaceC5997hd2() { // from class: gc4
            @Override // defpackage.InterfaceC5997hd2
            public final C10966w50 b(C10966w50 c10966w50) {
                return c10966w50;
            }
        };
        e = new ViewTreeObserverOnGlobalLayoutListenerC7367lc4();
    }

    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void m(View view, O0 o0) {
        if (o0 == null && (d(view) instanceof N0)) {
            o0 = new O0();
        }
        view.setAccessibilityDelegate(o0 == null ? null : o0.b);
    }

    public static View.AccessibilityDelegate d(View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (Build.VERSION.SDK_INT < 29) {
            if (c) {
                return null;
            }
            if (b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    c = true;
                    return null;
                }
            }
            try {
                Object obj = b.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                c = true;
                return null;
            }
        }
        accessibilityDelegate = view.getAccessibilityDelegate();
        return accessibilityDelegate;
    }

    public static void k(View view, C5792h1 c5792h1, S1 s1) {
        O0 o0;
        if (s1 != null) {
            C5792h1 c5792h12 = new C5792h1(null, c5792h1.b, null, s1, c5792h1.c);
            View.AccessibilityDelegate d2 = d(view);
            if (d2 == null) {
                o0 = null;
            } else if (d2 instanceof N0) {
                o0 = ((N0) d2).a;
            } else {
                o0 = new O0(d2);
            }
            if (o0 == null) {
                o0 = new O0();
            }
            m(view, o0);
            j(view, c5792h12.a());
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
            if (arrayList == null) {
                arrayList = new ArrayList();
                view.setTag(R.id.tag_accessibility_actions, arrayList);
            }
            arrayList.add(c5792h12);
            g(view, 0);
            return;
        }
        j(view, c5792h1.a());
        g(view, 0);
    }

    public static void j(View view, int i) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((C5792h1) arrayList.get(i2)).a() == i) {
                arrayList.remove(i2);
                return;
            }
        }
    }

    public static C6349ie4 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        C6349ie4 c6349ie4 = (C6349ie4) a.get(view);
        if (c6349ie4 != null) {
            return c6349ie4;
        }
        C6349ie4 c6349ie42 = new C6349ie4(view);
        a.put(view, c6349ie42);
        return c6349ie42;
    }

    public static void o(View view, InterfaceC11483xc2 interfaceC11483xc2) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC11483xc2);
        }
        if (interfaceC11483xc2 == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC8055nc4(view, interfaceC11483xc2));
        }
    }

    public static C5389fq4 h(View view, C5389fq4 c5389fq4) {
        WindowInsets f = c5389fq4.f();
        if (f != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f);
            if (!onApplyWindowInsets.equals(f)) {
                return C5389fq4.g(view, onApplyWindowInsets);
            }
        }
        return c5389fq4;
    }

    public static C5389fq4 b(View view, C5389fq4 c5389fq4) {
        WindowInsets f = c5389fq4.f();
        if (f != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(f);
            if (!dispatchApplyWindowInsets.equals(f)) {
                return C5389fq4.g(view, dispatchApplyWindowInsets);
            }
        }
        return c5389fq4;
    }

    public static String[] e(View view) {
        String[] receiveContentMimeTypes;
        if (Build.VERSION.SDK_INT < 31) {
            return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
        }
        receiveContentMimeTypes = view.getReceiveContentMimeTypes();
        return receiveContentMimeTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C10966w50 i(View view, C10966w50 c10966w50) {
        ContentInfo performReceiveContent;
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c10966w50);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            ContentInfo i = c10966w50.a.i();
            Objects.requireNonNull(i);
            performReceiveContent = view.performReceiveContent(i);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == i ? c10966w50 : new C10966w50(new C9937t50(performReceiveContent));
        }
        HJ3 hj3 = (HJ3) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC5997hd2 interfaceC5997hd2 = d;
        if (hj3 != null) {
            C10966w50 a2 = HJ3.a(view, c10966w50);
            if (a2 == null) {
                return null;
            }
            if (view instanceof InterfaceC5997hd2) {
                interfaceC5997hd2 = (InterfaceC5997hd2) view;
            }
            return interfaceC5997hd2.b(a2);
        }
        if (view instanceof InterfaceC5997hd2) {
            interfaceC5997hd2 = (InterfaceC5997hd2) view;
        }
        return interfaceC5997hd2.b(c10966w50);
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = Dc4.d;
        Dc4 dc4 = (Dc4) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (dc4 == null) {
            dc4 = new Dc4();
            view.setTag(R.id.tag_unhandled_key_event_manager, dc4);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = dc4.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = Dc4.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (dc4.a == null) {
                        dc4.a = new WeakHashMap();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList arrayList3 = Dc4.d;
                        View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            dc4.a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                dc4.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = dc4.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (dc4.b == null) {
                    dc4.b = new SparseArray();
                }
                dc4.b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static void n(CharSequence charSequence, View view) {
        new C6337ic4().e(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC7367lc4 viewTreeObserverOnGlobalLayoutListenerC7367lc4 = e;
        if (charSequence != null) {
            viewTreeObserverOnGlobalLayoutListenerC7367lc4.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC7367lc4);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC7367lc4);
                return;
            }
            return;
        }
        viewTreeObserverOnGlobalLayoutListenerC7367lc4.a.remove(view);
        view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC7367lc4);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC7367lc4);
    }

    public static void g(View view, int i) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (!(i2 >= 28)) {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            } else {
                tag = view.getAccessibilityPaneTitle();
            }
            boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    List<CharSequence> text = obtain.getText();
                    if (!(i2 >= 28)) {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    } else {
                        charSequence = view.getAccessibilityPaneTitle();
                    }
                    text.add(charSequence);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        }
                        if (((View) parent).getImportantForAccessibility() != 4) {
                            parent = parent.getParent();
                        } else {
                            view.setImportantForAccessibility(2);
                            break;
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                List<CharSequence> text2 = obtain2.getText();
                if (!(i2 >= 28)) {
                    Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                    if (CharSequence.class.isInstance(tag3)) {
                        charSequence = tag3;
                    }
                } else {
                    charSequence = view.getAccessibilityPaneTitle();
                }
                text2.add(charSequence);
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                }
            }
        }
    }

    public static C5389fq4 f(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C5389fq4 g = C5389fq4.g(null, rootWindowInsets);
        Up4 up4 = g.a;
        up4.p(g);
        up4.d(view.getRootView());
        return g;
    }
}
