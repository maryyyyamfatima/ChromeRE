package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC11983z30 implements DialogInterface.OnClickListener {
    public final WeakReference a;
    public DialogC5834h8 g;
    public Runnable h;

    public DialogInterfaceOnClickListenerC11983z30(WeakReference weakReference) {
        this.a = weakReference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.h.run();
    }

    public final void a(String str, String str2, int i, Runnable runnable) {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        this.h = runnable;
        C5490g8 c5490g8 = new C5490g8(context, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        C4115c8 c4115c8 = c5490g8.a;
        View inflate = LayoutInflater.from(c4115c8.a).inflate(R.layout.f56530_resource_name_obfuscated_res_0x7f0e0095, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.confirmation_dialog_title)).setText(str);
        ((TextView) inflate.findViewById(R.id.confirmation_dialog_message)).setText(str2);
        c4115c8.q = inflate;
        c5490g8.e(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4, null);
        c5490g8.f(i, this);
        DialogC5834h8 a = c5490g8.a();
        this.g = a;
        a.show();
    }
}
