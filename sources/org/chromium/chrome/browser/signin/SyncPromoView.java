package org.chromium.chrome.browser.signin;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC1658Mt3;
import defpackage.C1009Ht3;
import defpackage.C1139It3;
import defpackage.C1399Kt3;
import defpackage.InterfaceC1528Lt3;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.chrome.browser.signin.SyncPromoView;
import org.chromium.chrome.browser.sync.settings.ManageSyncSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SyncPromoView extends LinearLayout implements InterfaceC1528Lt3 {
    public static final /* synthetic */ int j = 0;
    public int a;
    public TextView g;
    public TextView h;
    public Button i;

    public static SyncPromoView a(int i, ViewGroup viewGroup) {
        SyncPromoView syncPromoView = (SyncPromoView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f61310_resource_name_obfuscated_res_0x7f0e02a7, viewGroup, false);
        syncPromoView.a = i;
        if (i == 9) {
            syncPromoView.g.setText(R.string.f88780_resource_name_obfuscated_res_0x7f140b0d);
        } else {
            syncPromoView.g.setVisibility(8);
        }
        return syncPromoView;
    }

    public SyncPromoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView) findViewById(R.id.title);
        this.h = (TextView) findViewById(R.id.description);
        this.i = (Button) findViewById(R.id.sign_in);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Gt3] */
    public final void b() {
        C1399Kt3 c1399Kt3;
        if (!AbstractC1658Mt3.b().j() || AbstractC1658Mt3.b().e().isEmpty()) {
            c1399Kt3 = new C1399Kt3(this.a == 9 ? R.string.f69540_resource_name_obfuscated_res_0x7f1402b5 : R.string.f84330_resource_name_obfuscated_res_0x7f140945, new C1139It3(new View.OnClickListener() { // from class: Gt3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = SyncPromoView.j;
                    Context context = SyncPromoView.this.getContext();
                    Bundle S0 = ManageSyncSettings.S0(false);
                    String name = ManageSyncSettings.class.getName();
                    Intent a = AbstractC7459ls0.a(context, SettingsActivity.class);
                    if (!(context instanceof Activity)) {
                        a.addFlags(268435456);
                        a.addFlags(67108864);
                    }
                    a.putExtra("show_fragment", name);
                    a.putExtra("show_fragment_args", S0);
                    ComponentName componentName = AbstractC2281Ro1.a;
                    try {
                        context.startActivity(a, null);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }));
        } else {
            c1399Kt3 = new C1399Kt3(R.string.f78830_resource_name_obfuscated_res_0x7f14070d, new C1009Ht3());
        }
        TextView textView = this.h;
        Button button = this.i;
        textView.setText(c1399Kt3.a);
        c1399Kt3.b.a(button);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1658Mt3.b().a(this);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC1658Mt3.b().l(this);
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        b();
    }
}
