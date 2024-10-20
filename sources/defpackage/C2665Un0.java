package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.android.chrome.R;
import org.chromium.chrome.browser.app.ChromeActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Un0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2665Un0 {
    public final N8 a;
    public final FrameLayout b;
    public final int c;
    public InterfaceC2535Tn0 d;
    public boolean e;

    public C2665Un0(ChromeActivity chromeActivity, InterfaceC2535Tn0 interfaceC2535Tn0) {
        this.d = interfaceC2535Tn0;
        FrameLayout frameLayout = new FrameLayout(chromeActivity);
        this.b = frameLayout;
        frameLayout.setBackgroundColor(chromeActivity.getResources().getColor(R.color.f24720_resource_name_obfuscated_res_0x7f070796));
        N8 n8 = new N8(chromeActivity, R.style.f96230_resource_name_obfuscated_res_0x7f1501bd);
        this.a = n8;
        n8.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: Qn0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C2665Un0.this.a();
            }
        });
        n8.addContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        Window window = n8.getWindow();
        window.setGravity(17);
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        b(window);
        this.c = chromeActivity.getResources().getDimensionPixelSize(R.dimen.f38410_resource_name_obfuscated_res_0x7f080668);
    }

    public static void b(Window window) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        AbstractC9771sd.h(window.getDecorView().getRootView(), !AbstractC3899bX.g(window.getStatusBarColor()));
    }

    public final void a() {
        InterfaceC2535Tn0 interfaceC2535Tn0 = this.d;
        if (interfaceC2535Tn0 == null) {
            return;
        }
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = (ViewOnClickListenerC5731gq2) interfaceC2535Tn0;
        viewOnClickListenerC5731gq2.N = true;
        ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0 = viewOnClickListenerC5731gq2.m;
        if (viewOnClickListenerC0501Dw0.isShowing()) {
            viewOnClickListenerC0501Dw0.dismiss();
        }
        ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw02 = viewOnClickListenerC5731gq2.n;
        if (viewOnClickListenerC0501Dw02.isShowing()) {
            viewOnClickListenerC0501Dw02.dismiss();
        }
        if (!viewOnClickListenerC5731gq2.f11508J) {
            C4546dP c4546dP = (C4546dP) ((C1642Mq2) viewOnClickListenerC5731gq2.h).p;
            c4546dP.e.a(0);
            c4546dP.b("User closed the Payment Request UI.");
        }
        this.d = null;
    }
}
