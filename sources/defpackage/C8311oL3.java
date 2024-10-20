package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oL3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8311oL3 extends View {
    public final Handler a;
    public final View g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public final AtomicReference j;
    public final AtomicReference k;
    public final C7623mL3 l;

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    public C8311oL3(Context context, Handler handler, View view, C7623mL3 c7623mL3) {
        super(context);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.h = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        this.i = atomicBoolean2;
        AtomicReference atomicReference = new AtomicReference();
        this.j = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.k = atomicReference2;
        this.a = handler;
        this.g = view;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setVisibility(0);
        atomicBoolean.set(view.hasFocus());
        atomicBoolean2.set(view.hasWindowFocus());
        atomicReference.set(view.getWindowToken());
        atomicReference2.set(view.getRootView());
        this.l = c7623mL3;
    }

    @Override // android.view.View
    public final Handler getHandler() {
        return this.a;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        return this.g == view;
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        return (InputConnection) PostTask.e(AbstractC5103f04.d, new Callable() { // from class: nL3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C8311oL3 c8311oL3 = C8311oL3.this;
                C7623mL3 c7623mL3 = c8311oL3.l;
                c7623mL3.f = false;
                InputConnection onCreateInputConnection = c8311oL3.g.onCreateInputConnection(editorInfo);
                c7623mL3.f = true;
                return onCreateInputConnection;
            }
        });
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.i.get();
    }

    @Override // android.view.View
    public final View getRootView() {
        if (this.i.get()) {
            return (View) this.k.get();
        }
        return null;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.h.get();
    }

    @Override // android.view.View
    public final IBinder getWindowToken() {
        return (IBinder) this.j.get();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
