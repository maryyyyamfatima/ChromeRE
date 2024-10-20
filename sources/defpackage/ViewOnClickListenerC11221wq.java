package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.autofill.AutofillSuggestion;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC11221wq extends FrameLayout implements View.OnClickListener {
    public final AbstractC7127ku0 a;
    public final InterfaceC11564xq g;

    public ViewOnClickListenerC11221wq(Context context, AbstractC7127ku0 abstractC7127ku0, C5734gr c5734gr) {
        super(context);
        this.a = abstractC7127ku0;
        this.g = c5734gr;
        View.inflate(context, R.layout.f55900_resource_name_obfuscated_res_0x7f0e004c, this);
        ((TextView) findViewById(R.id.dropdown_label)).setText(abstractC7127ku0.d());
        ImageView imageView = (ImageView) findViewById(R.id.dropdown_icon);
        if (abstractC7127ku0.b() == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(AbstractC2884Wf.a(context, abstractC7127ku0.b()));
        }
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5734gr c5734gr = (C5734gr) this.g;
        int i = 0;
        while (true) {
            if (i >= c5734gr.i.size()) {
                i = -1;
                break;
            } else if (((AutofillSuggestion) c5734gr.i.get(i)).f == ((AutofillSuggestion) this.a).f) {
                break;
            } else {
                i++;
            }
        }
        c5734gr.h.b(i);
    }
}
