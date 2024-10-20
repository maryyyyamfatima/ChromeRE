package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.InvocationTargetException;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ta */
/* loaded from: classes2.dex */
public final class C2469Ta implements InterfaceC12242zo3, InterfaceC10184to3 {
    public final InputMethodManager a;
    public View b;

    @Override // defpackage.InterfaceC12242zo3
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.InterfaceC12242zo3
    public final boolean b() {
        return true;
    }

    @Override // defpackage.InterfaceC12242zo3
    public final /* synthetic */ void c(View view, MotionEvent motionEvent) {
    }

    @Override // defpackage.InterfaceC12242zo3
    public final /* synthetic */ boolean d(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.InterfaceC10184to3
    public final /* synthetic */ C0201Bo0 e() {
        return null;
    }

    @Override // defpackage.InterfaceC12242zo3
    public final /* synthetic */ void f(Context context) {
    }

    @Override // defpackage.InterfaceC12242zo3
    public final /* synthetic */ void h(int i, int i2, String str) {
    }

    @Override // defpackage.InterfaceC10184to3
    public final void i(Context context, boolean z) {
    }

    @Override // defpackage.InterfaceC12242zo3
    public final /* synthetic */ void j(Rect rect, boolean z) {
    }

    @Override // defpackage.InterfaceC12242zo3
    public final /* synthetic */ void k(EditorInfo editorInfo) {
    }

    public C2469Ta(Context context) {
        this.a = (InputMethodManager) context.getSystemService(InputMethodManager.class);
    }

    @Override // defpackage.InterfaceC10184to3
    public final void g(Context context, WebContents webContents) {
        webContents.V0(this);
        webContents.C();
        if (webContents.C() == null) {
            return;
        }
        View containerView = webContents.C().getContainerView();
        try {
            containerView.getClass().getMethod("setAutoHandwritingEnabled", Boolean.TYPE).invoke(containerView, Boolean.FALSE);
            this.b = containerView;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Reflection failed in AndroidStylusWritingHandler", e);
        }
    }

    @Override // defpackage.InterfaceC12242zo3
    public final boolean m(C7744mi1 c7744mi1) {
        try {
            InputMethodManager inputMethodManager = this.a;
            inputMethodManager.getClass().getMethod("startStylusHandwriting", View.class).invoke(inputMethodManager, this.b);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Reflection failed in AndroidStylusWritingHandler", e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Sa] */
    @Override // defpackage.InterfaceC12242zo3
    public final void l(Rect rect, Point point) {
        final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
        final RectF rectF = new RectF(rect);
        try {
            new Object() { // from class: Sa
                public final void a() {
                    Class<?> cls = Class.forName("android.view.inputmethod.EditorBoundsInfo$Builder");
                    Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                    cls.getMethod("setHandwritingBounds", RectF.class).invoke(newInstance, rectF);
                    Object invoke = cls.getMethod("build", new Class[0]).invoke(newInstance, new Object[0]);
                    Class<?> cls2 = Class.forName("android.view.inputmethod.EditorBoundsInfo");
                    CursorAnchorInfo.Builder builder2 = builder;
                    builder2.getClass().getMethod("setEditorBoundsInfo", cls2).invoke(builder2, invoke);
                }
            }.a();
            this.a.updateCursorAnchorInfo(this.b, builder.build());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Reflection failed in AndroidStylusWritingHandler", e);
        }
    }
}
