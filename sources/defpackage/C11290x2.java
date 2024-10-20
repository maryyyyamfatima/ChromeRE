package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.password_manager.AccountChooserDialog;
import org.chromium.chrome.browser.password_manager.Credential;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11290x2 extends ArrayAdapter {
    public final /* synthetic */ AccountChooserDialog a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11290x2(AccountChooserDialog accountChooserDialog, Context context, Credential[] credentialArr) {
        super(context, 0, credentialArr);
        this.a = accountChooserDialog;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(final int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.f55460_resource_name_obfuscated_res_0x7f0e0020, viewGroup, false);
        }
        view.setSelected(false);
        view.setOnClickListener(new View.OnClickListener() { // from class: v2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AccountChooserDialog accountChooserDialog = C11290x2.this.a;
                accountChooserDialog.n = accountChooserDialog.g[i];
                DialogC5834h8 dialogC5834h8 = accountChooserDialog.p;
                if (dialogC5834h8 != null) {
                    dialogC5834h8.dismiss();
                }
            }
        });
        view.setTag(Integer.valueOf(i));
        Credential credential = (Credential) getItem(i);
        ImageView imageView = (ImageView) view.findViewById(R.id.profile_image);
        Drawable drawable = credential.f;
        if (drawable == null) {
            drawable = AbstractC2884Wf.a(getContext(), R.drawable.f51120_resource_name_obfuscated_res_0x7f090374);
        }
        imageView.setImageDrawable(drawable);
        TextView textView = (TextView) view.findViewById(R.id.main_name);
        TextView textView2 = (TextView) view.findViewById(R.id.secondary_name);
        String str = credential.d;
        boolean isEmpty = str.isEmpty();
        String str2 = credential.a;
        if (isEmpty) {
            String str3 = credential.b;
            if (str3.isEmpty()) {
                textView.setText(str2);
                textView2.setVisibility(8);
            } else {
                textView.setText(str3);
                textView2.setText(str2);
                textView2.setVisibility(0);
            }
        } else {
            textView.setText(str2);
            textView2.setText(str);
            textView2.setVisibility(0);
        }
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.psl_info_btn);
        String str4 = credential.c;
        if (!str4.isEmpty()) {
            imageButton.setVisibility(0);
            imageButton.setOnClickListener(new ViewOnClickListenerC10947w2(this, str4));
        }
        return view;
    }
}
