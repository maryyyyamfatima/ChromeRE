package defpackage;

import J.N;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.chrome.browser.app.feed.feedmanagement.FeedManagementActivity;
import org.chromium.chrome.browser.app.feed.followmanagement.FollowManagementActivity;
import org.chromium.chrome.browser.feed.settings.FeedAutoplaySettingsFragment;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zJ0 */
/* loaded from: classes.dex */
public final class C12070zJ0 {
    public final Context a;
    public final InterfaceC11727yJ0 b;
    public final InterfaceC11384xJ0 c;
    public final int d;

    public C12070zJ0(Context context, C7616mK1 c7616mK1, InterfaceC11727yJ0 interfaceC11727yJ0, InterfaceC11384xJ0 interfaceC11384xJ0, int i) {
        this.a = context;
        this.b = interfaceC11727yJ0;
        this.c = interfaceC11384xJ0;
        this.d = i;
        c7616mK1.s(new C7272lK1(0, a(R.string.0_resource_name_obfuscated_res_0x7f1404a3, R.string.0_resource_name_obfuscated_res_0x7f1404a4, new View.OnClickListener() { // from class: sJ0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12070zJ0 c12070zJ0 = C12070zJ0.this;
                N.MxULk9PS(c12070zJ0.d, 16);
                c12070zJ0.b("https://myactivity.google.com/myactivity?product=50");
            }
        })));
        c7616mK1.s(new C7272lK1(0, a(R.string.0_resource_name_obfuscated_res_0x7f1404ab, R.string.0_resource_name_obfuscated_res_0x7f1404ac, new View.OnClickListener() { // from class: tJ0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12070zJ0 c12070zJ0 = C12070zJ0.this;
                N.MxULk9PS(c12070zJ0.d, 6);
                c12070zJ0.b("https://www.google.com/preferences/interests/yourinterests?sh=n");
            }
        })));
        c7616mK1.s(new C7272lK1(0, a(R.string.0_resource_name_obfuscated_res_0x7f1404a9, R.string.0_resource_name_obfuscated_res_0x7f1404aa, new View.OnClickListener() { // from class: uJ0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12070zJ0 c12070zJ0 = C12070zJ0.this;
                N.MxULk9PS(c12070zJ0.d, 6);
                c12070zJ0.b("https://www.google.com/preferences/interests/hidden?sh=n");
            }
        })));
        if (N.MqhKj56k()) {
            c7616mK1.s(new C7272lK1(0, a(R.string.0_resource_name_obfuscated_res_0x7f1404a5, R.string.0_resource_name_obfuscated_res_0x7f1404a6, new View.OnClickListener() { // from class: vJ0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C12070zJ0 c12070zJ0 = C12070zJ0.this;
                    N.MxULk9PS(c12070zJ0.d, 40);
                    Context context2 = c12070zJ0.a;
                    ((FeedManagementActivity) c12070zJ0.c).getClass();
                    try {
                        Bundle bundle = new Bundle();
                        String name = FeedAutoplaySettingsFragment.class.getName();
                        Intent intent = new Intent();
                        intent.setClass(context2, SettingsActivity.class);
                        if (!(context2 instanceof Activity)) {
                            intent.addFlags(268435456);
                            intent.addFlags(67108864);
                        }
                        intent.putExtra("show_fragment", name);
                        intent.putExtra("show_fragment_args", bundle);
                        ComponentName componentName = AbstractC2281Ro1.a;
                        try {
                            context2.startActivity(intent, null);
                        } catch (ActivityNotFoundException unused) {
                        }
                        AbstractC6588jL0.a(5);
                    } catch (Exception e) {
                        e.toString();
                    }
                }
            })));
        }
        c7616mK1.s(new C7272lK1(0, a(R.string.0_resource_name_obfuscated_res_0x7f1404a7, R.string.0_resource_name_obfuscated_res_0x7f1404a8, new View.OnClickListener() { // from class: wJ0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12070zJ0 c12070zJ0 = C12070zJ0.this;
                N.MxULk9PS(c12070zJ0.d, 30);
                Context context2 = c12070zJ0.a;
                ((FeedManagementActivity) c12070zJ0.b).getClass();
                try {
                    context2.startActivity(new Intent(context2, (Class<?>) FollowManagementActivity.class));
                } catch (Exception e) {
                    e.toString();
                }
            }
        })));
    }

    public final PropertyModel a(int i, int i2, View.OnClickListener onClickListener) {
        Context context = this.a;
        String string = context.getResources().getString(i);
        String string2 = context.getResources().getString(i2);
        HashMap e = PropertyModel.e(AbstractC9326rJ0.d);
        PD2 pd2 = AbstractC9326rJ0.a;
        GD2 gd2 = new GD2();
        gd2.a = string;
        e.put(pd2, gd2);
        PD2 pd22 = AbstractC9326rJ0.b;
        GD2 gd22 = new GD2();
        gd22.a = string2;
        e.put(pd22, gd22);
        PD2 pd23 = AbstractC9326rJ0.c;
        GD2 gd23 = new GD2();
        gd23.a = onClickListener;
        return AbstractC5266fV2.a(e, pd23, gd23, e);
    }

    public final void b(String str) {
        C3140Ye0 c3140Ye0 = new C3140Ye0();
        c3140Ye0.d();
        c3140Ye0.c(1);
        C3270Ze0 a = c3140Ye0.a();
        Uri parse = Uri.parse(str);
        Intent intent = a.a;
        intent.setData(parse);
        intent.setAction("android.intent.action.VIEW");
        Context context = this.a;
        intent.setClassName(context, "org.chromium.chrome.browser.customtabs.CustomTabActivity");
        intent.addFlags(268435456);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.setPackage(context.getPackageName());
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(context.getPackageName(), "FakeClass"));
        intent.putExtra("trusted_application_code_extra", PendingIntent.getActivity(context, 0, intent2, 67108864));
        context.startActivity(intent);
    }
}
