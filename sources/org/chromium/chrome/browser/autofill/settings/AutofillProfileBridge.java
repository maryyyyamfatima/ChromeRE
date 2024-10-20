package org.chromium.chrome.browser.autofill.settings;

import J.N;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC7459ls0;
import defpackage.C1021Hw0;
import defpackage.C6078hr;
import defpackage.C6764jr;
import defpackage.FI2;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillProfileBridge {
    public String a;

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        N.M6KwIT3h(arrayList, arrayList2);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList3.add(new C1021Hw0((String) arrayList.get(i), (CharSequence) arrayList2.get(i)));
        }
        Collator collator = Collator.getInstance(Locale.getDefault());
        collator.setStrength(0);
        Collections.sort(arrayList3, new C6078hr(collator));
        return arrayList3;
    }

    public final ArrayList a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        this.a = N.MRFNh4wI(str, str2, arrayList, arrayList2, arrayList3, arrayList4);
        for (int i = 0; i < arrayList.size(); i++) {
            int intValue = ((Integer) arrayList.get(i)).intValue();
            String str3 = (String) arrayList2.get(i);
            boolean z = true;
            boolean z2 = ((Integer) arrayList3.get(i)).intValue() == 1;
            if (((Integer) arrayList4.get(i)).intValue() != 1) {
                z = false;
            }
            arrayList5.add(new C6764jr(intValue, str3, z2, z));
        }
        return arrayList5;
    }

    public static void stringArrayToList(String[] strArr, List list) {
        for (String str : strArr) {
            list.add(str);
        }
    }

    public static void intArrayToList(int[] iArr, List list) {
        for (int i : iArr) {
            list.add(Integer.valueOf(i));
        }
    }

    public static void showAutofillProfileSettings(WebContents webContents) {
        FI2.a("AutofillAddressesViewed");
        c(webContents, AutofillProfilesFragment.class);
    }

    public static void showAutofillCreditCardSettings(WebContents webContents) {
        FI2.a("AutofillCreditCardsViewed");
        c(webContents, AutofillPaymentMethodsFragment.class);
    }

    public static void c(WebContents webContents, Class cls) {
        Context context = (Context) webContents.Q0().k().get();
        String name = cls.getName();
        Intent a = AbstractC7459ls0.a(context, SettingsActivity.class);
        if (!(context instanceof Activity)) {
            a.addFlags(268435456);
            a.addFlags(67108864);
        }
        a.putExtra("show_fragment", name);
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            context.startActivity(a, null);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
