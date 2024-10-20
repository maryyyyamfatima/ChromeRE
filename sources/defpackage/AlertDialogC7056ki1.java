package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ki1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AlertDialogC7056ki1 extends AlertDialog {
    public AlertDialogC7056ki1(Context context, Bitmap bitmap) {
        super(context, R.style.f105230_resource_name_obfuscated_res_0x7f150548);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f57960_resource_name_obfuscated_res_0x7f0e012e, (ViewGroup) null);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: ji1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlertDialogC7056ki1.this.dismiss();
            }
        });
        ((ImageView) inflate.findViewById(R.id.image_zoom)).setImageBitmap(bitmap);
        setView(inflate);
    }
}
