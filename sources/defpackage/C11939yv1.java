package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C11939yv1 {
    public static C11939yv1 g = new C11939yv1();
    public final C12157za2 a = new C12157za2();

    public void g() {
    }

    public void j() {
    }

    public void i(View view) {
        new RunnableC11253wv1(view, new AtomicInteger(), new Handler()).run();
    }

    public boolean d(View view) {
        return c(view);
    }

    public static boolean c(View view) {
        return ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public int b(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getHeight() - (rect.height() + rect.top);
        if (height <= 0) {
            return 0;
        }
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        return rootWindowInsets != null ? height - rootWindowInsets.getStableInsetBottom() : height;
    }

    public boolean f(Context context, View view) {
        return e(view);
    }

    public final boolean e(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            int b = b(rootView);
            Rect rect = new Rect();
            rootView.getWindowVisibleDisplayFrame(rect);
            rect.width();
            rootView.getWidth();
            if (b > 0) {
                return true;
            }
        }
        return false;
    }

    public void a(InterfaceC11596xv1 interfaceC11596xv1) {
        C12157za2 c12157za2 = this.a;
        if (c12157za2.isEmpty()) {
            g();
        }
        c12157za2.a(interfaceC11596xv1);
    }

    public void h(InterfaceC11596xv1 interfaceC11596xv1) {
        C12157za2 c12157za2 = this.a;
        c12157za2.d(interfaceC11596xv1);
        if (c12157za2.isEmpty()) {
            j();
        }
    }
}
