package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public abstract class J9 {
    public static final /* synthetic */ int a = 0;

    public static void a(Context context, int i, int i2, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.f96380_resource_name_obfuscated_res_0x7f1501cd);
        builder.setMessage(i).setTitle(R.string.f72160_resource_name_obfuscated_res_0x7f1403fd).setPositiveButton(i2, onClickListener).setNegativeButton(R.string.f69900_resource_name_obfuscated_res_0x7f1402f5, new I9());
        builder.create().show();
    }
}
