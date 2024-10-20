package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.libraries.phenotype.client.stable.AccountRemovedBroadcastReceiver;
import com.google.common.util.concurrent.v;
import defpackage.AbstractC0562Ei1;
import defpackage.AbstractC3082Xs2;
import defpackage.AbstractC5957hW0;
import defpackage.AbstractRunnableC8534p;
import defpackage.C0;
import defpackage.C7123kt2;
import defpackage.C7335lX;
import defpackage.C8191o;
import defpackage.CV0;
import defpackage.D;
import defpackage.EnumC6747jo0;
import defpackage.InterfaceC3299Zk;
import defpackage.L82;
import defpackage.RD1;
import defpackage.RQ0;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("accountType");
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                final String string = intent.getExtras().getString("authAccount");
                final C7123kt2 b = C7123kt2.b(context);
                final BroadcastReceiver.PendingResult goAsync = goAsync();
                C0 e = AbstractC5957hW0.e(RQ0.x(AbstractC3082Xs2.b(b).b(new CV0() { // from class: Us2
                    @Override // defpackage.CV0
                    public final Object apply(Object obj) {
                        D4 d4 = (D4) E4.k.j();
                        for (Map.Entry entry : Collections.unmodifiableMap(((E4) obj).j).entrySet()) {
                            F2 f2 = (F2) entry.getValue();
                            E2 e2 = (E2) F2.m.j();
                            String str = f2.l;
                            String str2 = string;
                            if (!str.equals(str2)) {
                                String str3 = f2.l;
                                if (e2.h) {
                                    e2.l();
                                    e2.h = false;
                                }
                                F2 f22 = (F2) e2.g;
                                f22.getClass();
                                str3.getClass();
                                f22.j |= 1;
                                f22.l = str3;
                            }
                            for (String str4 : f2.k) {
                                if (!str4.equals(str2)) {
                                    e2.o(str4);
                                }
                            }
                            d4.o((F2) e2.j(), (String) entry.getKey());
                        }
                        return (E4) d4.j();
                    }
                }, b.a())), new InterfaceC3299Zk() { // from class: Vs2
                    @Override // defpackage.InterfaceC3299Zk
                    public final RD1 apply(Object obj) {
                        boolean isDeviceProtectedStorage;
                        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
                        C0042Ai1 c0042Ai1 = new C0042Ai1();
                        C7123kt2 c7123kt2 = C7123kt2.this;
                        c0042Ai1.c(c7123kt2.a);
                        if (AbstractC6404io0.b()) {
                            boolean b2 = AbstractC6404io0.b();
                            Context context2 = c7123kt2.a;
                            if (b2) {
                                isDeviceProtectedStorage = context2.isDeviceProtectedStorage();
                                if (!isDeviceProtectedStorage) {
                                    context2 = context2.createDeviceProtectedStorageContext();
                                }
                            }
                            c0042Ai1.c(context2);
                        }
                        C0172Bi1 listIterator = c0042Ai1.f().listIterator(0);
                        boolean z = true;
                        while (listIterator.hasNext()) {
                            StringBuilder a2 = M41.a(String.valueOf(((Context) listIterator.next()).getFilesDir()), "/phenotype/shared/");
                            a2.append(string);
                            File file = new File(a2.toString());
                            Log.i("PhenotypeAccountStore", "Removing snapshots for removed user");
                            if (file.exists()) {
                                z = AbstractC3082Xs2.a(file);
                            }
                        }
                        if (!z) {
                            return new v(new IOException("Unable to remove snapshots for removed user"));
                        }
                        return C9803si1.g;
                    }
                }, b.a());
                CV0 cv0 = new CV0() { // from class: D3
                    @Override // defpackage.CV0
                    public final Object apply(Object obj) {
                        int i = AccountRemovedBroadcastReceiver.a;
                        return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
                    }
                };
                EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
                int i = AbstractRunnableC8534p.m;
                C8191o c8191o = new C8191o(e, IOException.class, cv0);
                e.f(c8191o, enumC6747jo0);
                Object[] objArr = (Object[]) new RD1[]{c8191o, ((D) b.a()).submit(new Runnable() { // from class: E3
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = AccountRemovedBroadcastReceiver.a;
                        BT2 bt2 = AbstractC1657Mt2.a;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("PhenotypeStickyAccount", 0);
                        SharedPreferences.Editor editor = null;
                        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                            if ((entry.getValue() instanceof String) && entry.getValue().equals(string)) {
                                if (editor == null) {
                                    editor = sharedPreferences.edit();
                                }
                                editor.remove(entry.getKey());
                            }
                        }
                        if (editor != null) {
                            editor.commit();
                        }
                    }
                })}.clone();
                L82.a(objArr.length, objArr);
                new C7335lX((AbstractC0562Ei1) AbstractC0562Ei1.m(objArr.length, objArr), false, (Executor) enumC6747jo0, new Callable() { // from class: F3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i2 = AccountRemovedBroadcastReceiver.a;
                        goAsync.finish();
                        return null;
                    }
                });
            }
        }
    }
}
