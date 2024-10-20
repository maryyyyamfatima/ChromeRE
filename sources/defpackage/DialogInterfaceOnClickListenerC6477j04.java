package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j04, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC6477j04 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context a;

    public DialogInterfaceOnClickListenerC6477j04(Context context) {
        this.a = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.a;
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/daydream?p=daydream_help_menu")));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.f78290_resource_name_obfuscated_res_0x7f1406d2, 1).show();
            dialogInterface.cancel();
        }
    }
}
