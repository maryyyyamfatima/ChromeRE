package defpackage;

import java.util.HashMap;
import org.chromium.chrome.browser.safety_check.SafetyCheckSettingsFragment;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UT2 implements InterfaceC11471xa2 {
    public final /* synthetic */ SettingsLauncher a;
    public final /* synthetic */ C3083Xs3 b;
    public final /* synthetic */ InterfaceC7697ma2 c;
    public final /* synthetic */ WT2 d;

    public UT2(WT2 wt2, SettingsLauncher settingsLauncher, C3083Xs3 c3083Xs3, C8385oa2 c8385oa2) {
        this.d = wt2;
        this.a = settingsLauncher;
        this.b = c3083Xs3;
        this.c = c8385oa2;
    }

    @Override // defpackage.InterfaceC11471xa2
    public final void a(Object obj) {
        JA1 ja1 = (JA1) obj;
        if (ja1 == null) {
            return;
        }
        WT2 wt2 = this.d;
        if (wt2.c == null) {
            ja1.Z().a(wt2);
            SafetyCheckSettingsFragment safetyCheckSettingsFragment = wt2.a;
            HashMap e = PropertyModel.e(AbstractC10412uU2.j);
            ND2 nd2 = AbstractC10412uU2.a;
            DD2 dd2 = new DD2();
            dd2.a = 0;
            e.put(nd2, dd2);
            ND2 nd22 = AbstractC10412uU2.b;
            DD2 dd22 = new DD2();
            dd22.a = 0;
            e.put(nd22, dd22);
            ND2 nd23 = AbstractC10412uU2.c;
            DD2 dd23 = new DD2();
            dd23.a = 0;
            e.put(nd23, dd23);
            ND2 nd24 = AbstractC10412uU2.d;
            DD2 dd24 = new DD2();
            dd24.a = 0;
            e.put(nd24, dd24);
            OD2 od2 = AbstractC10412uU2.i;
            ED2 ed2 = new ED2();
            ed2.a = 0L;
            e.put(od2, ed2);
            PropertyModel propertyModel = new PropertyModel(e);
            UD2.a(propertyModel, safetyCheckSettingsFragment, new TD2() { // from class: TT2
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException
                    */
                @Override // defpackage.TD2
                public final void d(defpackage.WD2 r17, java.lang.Object r18, java.lang.Object r19) {
                    /*
                        Method dump skipped, instructions count: 582
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.TT2.d(WD2, java.lang.Object, java.lang.Object):void");
                }
            });
            wt2.c = new C10069tU2(propertyModel, wt2.b, this.a, this.b, this.c);
        }
    }
}
