package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.page_info.PageInfoRowView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gh2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC0818Gh2 extends FrameLayout implements View.OnClickListener {
    public LinearLayout a;
    public PageInfoRowView g;
    public PageInfoRowView h;
    public PageInfoRowView i;
    public Button j;
    public Runnable k;

    public ViewOnClickListenerC0818Gh2(Context context, C0688Fh2 c0688Fh2) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.f59260_resource_name_obfuscated_res_0x7f0e01d2, (ViewGroup) this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_info_row_wrapper);
        this.a = linearLayout;
        a(linearLayout, null, true);
        this.g = (PageInfoRowView) findViewById(R.id.page_info_connection_row);
        this.h = (PageInfoRowView) findViewById(R.id.page_info_permissions_row);
        this.i = (PageInfoRowView) findViewById(R.id.page_info_cookies_row);
        this.k = c0688Fh2.e;
        a((Button) findViewById(R.id.page_info_forget_site_button), null, false);
        a((TextView) findViewById(R.id.page_info_lite_mode_https_image_compression_message), null, false);
        Button button = (Button) findViewById(R.id.page_info_instant_app_button);
        this.j = button;
        a(button, c0688Fh2.c, c0688Fh2.a);
        a((Button) findViewById(R.id.page_info_open_online_button), c0688Fh2.d, c0688Fh2.b);
    }

    public final void a(View view, Runnable runnable, boolean z) {
        view.setVisibility(z ? 0 : 8);
        view.setTag(R.id.page_info_click_callback, runnable);
        if (runnable == null) {
            return;
        }
        view.setOnClickListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k.run();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag(R.id.page_info_click_callback);
        if (!(tag instanceof Runnable)) {
            throw new IllegalStateException("Unable to find click callback for view: " + view);
        }
        ((Runnable) tag).run();
    }
}
