package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC8536p00 extends Dialog implements JA1, InterfaceC0273Cc2 {
    public LA1 a;
    public final C0143Bc2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC8536p00(Context context, int i) {
        super(context, i);
        AbstractC0087Ar1.e(context, "context");
        this.g = new C0143Bc2(new Runnable() { // from class: o00
            @Override // java.lang.Runnable
            public final void run() {
                DialogC8536p00.a(DialogC8536p00.this);
            }
        });
    }

    @Override // defpackage.JA1
    public final LA1 Z() {
        LA1 la1 = this.a;
        if (la1 != null) {
            return la1;
        }
        LA1 la12 = new LA1(this);
        this.a = la12;
        return la12;
    }

    @Override // android.app.Dialog
    public void onStop() {
        LA1 la1 = this.a;
        if (la1 == null) {
            la1 = new LA1(this);
            this.a = la1;
        }
        la1.e(EnumC11340xA1.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LA1 la1 = this.a;
        if (la1 == null) {
            la1 = new LA1(this);
            this.a = la1;
        }
        la1.e(EnumC11340xA1.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        LA1 la1 = this.a;
        if (la1 == null) {
            la1 = new LA1(this);
            this.a = la1;
        }
        la1.e(EnumC11340xA1.ON_RESUME);
    }

    public static void a(DialogC8536p00 dialogC8536p00) {
        AbstractC0087Ar1.e(dialogC8536p00, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.g.c();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC0087Ar1.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0087Ar1.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0087Ar1.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        AbstractC0087Ar1.b(window);
        window.getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        AbstractC0087Ar1.b(window2);
        View decorView = window2.getDecorView();
        AbstractC0087Ar1.d(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }
}
