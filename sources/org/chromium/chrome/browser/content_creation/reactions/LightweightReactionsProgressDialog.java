package org.chromium.chrome.browser.content_creation.reactions;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC5103f04;
import defpackage.C5490g8;
import defpackage.DialogC5834h8;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.RunnableC11002wB1;
import org.chromium.base.task.PostTask;
import org.chromium.components.browser_ui.widget.MaterialProgressBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LightweightReactionsProgressDialog extends DialogInterfaceOnCancelListenerC7423lm0 {
    public MaterialProgressBar r0;
    public TextView s0;
    public View.OnClickListener t0;

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        Activity activity = getActivity();
        View inflate = activity.getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e024a, (ViewGroup) null);
        MaterialProgressBar materialProgressBar = (MaterialProgressBar) inflate.findViewById(R.id.reactions_progress_bar);
        this.r0 = materialProgressBar;
        materialProgressBar.setBackgroundColor(activity.getColor(R.color.0_resource_name_obfuscated_res_0x7f0707a4));
        MaterialProgressBar materialProgressBar2 = this.r0;
        materialProgressBar2.h.setColor(activity.getColor(R.color.0_resource_name_obfuscated_res_0x7f0707b0));
        materialProgressBar2.postInvalidateOnAnimation();
        this.r0.setContentDescription(getActivity().getString(R.string.0_resource_name_obfuscated_res_0x7f1405b8));
        TextView textView = (TextView) inflate.findViewById(R.id.reactions_progress_percentage);
        this.s0 = textView;
        textView.setImportantForAccessibility(2);
        ((Button) inflate.findViewById(R.id.reactions_progress_cancel)).setOnClickListener(this.t0);
        if (this.m0 != null) {
            PostTask.d(AbstractC5103f04.a, new RunnableC11002wB1(this, 0));
        }
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105210_resource_name_obfuscated_res_0x7f150546);
        c5490g8.a.q = inflate;
        DialogC5834h8 a = c5490g8.a();
        a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        a.setCanceledOnTouchOutside(false);
        return a;
    }
}
