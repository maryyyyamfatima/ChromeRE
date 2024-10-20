package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c23, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4083c23 {
    public final RelativeLayout a;
    public final ScrollView b;

    public C4083c23(Context context, final W13 w13, String str) {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.f60620_resource_name_obfuscated_res_0x7f0e0260, (ViewGroup) null);
        this.a = relativeLayout;
        this.b = (ScrollView) relativeLayout.findViewById(R.id.scroll_view);
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.secure_payment_confirmation_image);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.secure_payment_confirmation_nocredmatch_description);
        Button button = (Button) relativeLayout.findViewById(R.id.ok_button);
        imageView.setImageResource(R.drawable.f53080_resource_name_obfuscated_res_0x7f090478);
        textView.setText(String.format(context.getResources().getString(R.string.f78300_resource_name_obfuscated_res_0x7f1406d3), str));
        button.setOnClickListener(new View.OnClickListener() { // from class: b23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w13.run();
            }
        });
    }
}
