package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.search_engines.settings.SearchEngineSettings;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ig3 */
/* loaded from: classes.dex */
public final class DialogC6359ig3 extends OC2 {
    public final Callback i;
    public final Callback j;
    public final C11997z52 k;
    public int l;

    public DialogC6359ig3(Activity activity, CF1 cf1, Callback callback, final SettingsLauncher settingsLauncher) {
        super(activity);
        this.l = 3;
        this.k = new C11997z52(activity, new Callback() { // from class: hg3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                DialogC6359ig3 dialogC6359ig3 = DialogC6359ig3.this;
                dialogC6359ig3.l = 2;
                settingsLauncher.c(dialogC6359ig3.getContext(), SearchEngineSettings.class);
                dialogC6359ig3.dismiss();
            }
        });
        setOnDismissListener(this);
        setCanceledOnTouchOutside(false);
        this.i = callback;
        this.j = cf1;
    }

    @Override // defpackage.OC2
    public final NC2 a() {
        NC2 nc2 = new NC2();
        nc2.a = R.drawable.0_resource_name_obfuscated_res_0x7f09047f;
        nc2.b = R.string.0_resource_name_obfuscated_res_0x7f1409de;
        nc2.c = R.string.0_resource_name_obfuscated_res_0x7f140a84;
        nc2.e = R.string.0_resource_name_obfuscated_res_0x7f140717;
        nc2.f = R.string.0_resource_name_obfuscated_res_0x7f140576;
        return nc2;
    }

    @Override // defpackage.OC2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
            return;
        }
        StyleSpan styleSpan = new StyleSpan(1);
        TextView textView = (TextView) findViewById(R.id.subheader);
        textView.setText(AbstractC9108qg3.a(getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f140a84), new C8765pg3(this.k, "<link>", "</link>"), new C8765pg3(styleSpan, "<b>", "</b>")));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // defpackage.OC2, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.button_secondary) {
            this.l = 1;
        } else if (view.getId() == R.id.button_primary) {
            this.l = 0;
        }
        dismiss();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.l;
        Callback callback = this.j;
        if (i == 0) {
            callback.onResult(Boolean.TRUE);
        } else if (i == 1 || i == 2 || i == 3) {
            callback.onResult(Boolean.FALSE);
        }
        O83.a.p("LocaleManager_PREF_PROMO_SHOWN", true);
        EI2.h(this.l, 4, "SpecialLocale.PromotionDialog");
        Callback callback2 = this.i;
        if (callback2 != null) {
            callback2.onResult(Boolean.TRUE);
        }
    }
}
