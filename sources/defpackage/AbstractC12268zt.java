package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.chromium.base.TraceEvent;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zt */
/* loaded from: classes2.dex */
public abstract class AbstractC12268zt {
    public static SharedPreferences e() {
        return V60.a.getSharedPreferences("org.chromium.components.background_task_scheduler", 0);
    }

    public static void g(int i) {
        TraceEvent i2 = TraceEvent.i("BackgroundTaskSchedulerPrefs.removeScheduledTask", Integer.toString(i));
        try {
            e().edit().remove(String.valueOf(i)).apply();
            if (i2 != null) {
                i2.close();
            }
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public static C8365oW2 b(int i) {
        String string = e().getString(String.valueOf(i), null);
        if (string == null) {
            AbstractC4851eH1.a("BTSPrefs", AbstractC9076qb1.a("No data found for task id: ", i), new Object[0]);
            return null;
        }
        try {
            byte[] decode = Base64.decode(string, 0);
            C8365oW2 c8365oW2 = C8365oW2.o;
            int length = decode.length;
            XF0 c = XF0.c();
            C8365oW2 c8365oW22 = C8365oW2.o;
            C8365oW2 c8365oW23 = new C8365oW2();
            try {
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(c8365oW23.getClass());
                        b.f(c8365oW23, decode, 0, length + 0, new C2254Rj(c));
                        b.b(c8365oW23);
                        if (c8365oW23.a != 0) {
                            throw new RuntimeException();
                        }
                        QX0.i(c8365oW23);
                        return c8365oW23;
                    } catch (C1127Ir1 e) {
                        if (e.g) {
                            throw new C1127Ir1(e);
                        }
                        throw e;
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e2.getCause());
                    }
                    throw new C1127Ir1(e2);
                }
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 e4) {
            AbstractC4851eH1.a("BTSPrefs", "Invalid protocol buffer: " + e4, new Object[0]);
            g(i);
            return null;
        }
    }

    public static void a(TaskInfo taskInfo) {
        TraceEvent i = TraceEvent.i("BackgroundTaskSchedulerPrefs.addScheduledTask", Integer.toString(taskInfo.a));
        try {
            C11925yt c11925yt = new C11925yt(taskInfo.c, taskInfo.b, taskInfo.d);
            taskInfo.g.a(c11925yt);
            e().edit().putString(String.valueOf(taskInfo.a), c11925yt.a).apply();
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public static HashSet c() {
        TraceEvent i = TraceEvent.i("BackgroundTaskSchedulerPrefs.getScheduledTaskIds", null);
        try {
            HashSet hashSet = new HashSet();
            for (String str : e().getAll().keySet()) {
                try {
                    hashSet.add(Integer.valueOf(str));
                } catch (NumberFormatException unused) {
                    AbstractC4851eH1.a("BTSPrefs", "Incorrect task id: " + str, new Object[0]);
                }
            }
            if (i != null) {
                i.close();
            }
            return hashSet;
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }

    public static HashMap d() {
        int intValue;
        C8365oW2 c8365oW2;
        TraceEvent i = TraceEvent.i("BackgroundTaskSchedulerPrefs.getScheduledTasks", null);
        try {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, ?> entry : e().getAll().entrySet()) {
                try {
                    try {
                        intValue = Integer.valueOf(entry.getKey()).intValue();
                        byte[] decode = Base64.decode(String.valueOf(entry.getValue()), 0);
                        C8365oW2 c8365oW22 = C8365oW2.o;
                        int length = decode.length;
                        XF0 c = XF0.c();
                        C8365oW2 c8365oW23 = C8365oW2.o;
                        c8365oW2 = new C8365oW2();
                        try {
                            QW2 a = C7931nE2.c.a(c8365oW2);
                            a.f(c8365oW2, decode, 0, length + 0, new C2254Rj(c));
                            a.b(c8365oW2);
                        } catch (C1127Ir1 e) {
                            if (e.g) {
                                throw new C1127Ir1(e);
                            }
                            throw e;
                        } catch (IOException e2) {
                            if (e2.getCause() instanceof C1127Ir1) {
                                throw ((C1127Ir1) e2.getCause());
                            }
                            throw new C1127Ir1(e2);
                        } catch (IndexOutOfBoundsException unused) {
                            throw C1127Ir1.h();
                        } catch (C6827k14 e3) {
                            throw e3.a();
                        }
                    } catch (C1127Ir1 e4) {
                        AbstractC4851eH1.a("BTSPrefs", "Invalid protocol buffer: " + e4, new Object[0]);
                        g(Integer.valueOf(entry.getKey()).intValue());
                    }
                } catch (NumberFormatException unused2) {
                    AbstractC4851eH1.a("BTSPrefs", "Incorrect task id: " + entry.getKey(), new Object[0]);
                }
                if (c8365oW2.a != 0) {
                    throw new RuntimeException();
                }
                QX0.i(c8365oW2);
                hashMap.put(Integer.valueOf(intValue), c8365oW2);
            }
            if (i != null) {
                i.close();
            }
            return hashMap;
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused3) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f() {
        /*
            java.lang.String r0 = "bts_scheduled_tasks"
            java.lang.String r1 = "BackgroundTaskSchedulerPrefs.migrateStoredTasksToProto"
            r2 = 0
            org.chromium.base.TraceEvent r1 = org.chromium.base.TraceEvent.i(r1, r2)
            android.content.SharedPreferences r3 = defpackage.T60.a     // Catch: java.lang.Throwable -> L9c
            java.util.Set r4 = r3.getStringSet(r0, r2)     // Catch: java.lang.Throwable -> L9c
            if (r4 != 0) goto L17
            if (r1 == 0) goto L16
            r1.close()
        L16:
            return
        L17:
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L9c
            android.content.SharedPreferences$Editor r0 = r3.remove(r0)     // Catch: java.lang.Throwable -> L9c
            r0.apply()     // Catch: java.lang.Throwable -> L9c
            android.content.SharedPreferences r0 = e()     // Catch: java.lang.Throwable -> L9c
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L9c
            java.util.Iterator r3 = r4.iterator()     // Catch: java.lang.Throwable -> L9c
        L2e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L93
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L9c
            r5 = 0
            if (r4 != 0) goto L3e
            goto L66
        L3e:
            java.lang.String r6 = ":"
            java.lang.String[] r4 = r4.split(r6)     // Catch: java.lang.Throwable -> L9c
            int r6 = r4.length     // Catch: java.lang.Throwable -> L9c
            r7 = 2
            if (r6 != r7) goto L66
            r6 = r4[r5]     // Catch: java.lang.Throwable -> L9c
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L9c
            if (r6 != 0) goto L66
            r6 = 1
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L9c
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L9c
            if (r7 == 0) goto L5a
            goto L66
        L5a:
            r4 = r4[r6]     // Catch: java.lang.NumberFormatException -> L66 java.lang.Throwable -> L9c
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L66 java.lang.Throwable -> L9c
            xt r6 = new xt     // Catch: java.lang.Throwable -> L9c
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L9c
            goto L67
        L66:
            r6 = r2
        L67:
            if (r6 != 0) goto L73
            java.lang.String r4 = "BTSPrefs"
            java.lang.String r6 = "Scheduled task could not be parsed from storage."
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L9c
            defpackage.AbstractC4851eH1.f(r4, r6, r5)     // Catch: java.lang.Throwable -> L9c
            goto L2e
        L73:
            int r4 = r6.a     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L9c
            oW2 r6 = defpackage.C8365oW2.o     // Catch: java.lang.Throwable -> L9c
            JX0 r6 = r6.j()     // Catch: java.lang.Throwable -> L9c
            gW2 r6 = (defpackage.C5615gW2) r6     // Catch: java.lang.Throwable -> L9c
            QX0 r6 = r6.j()     // Catch: java.lang.Throwable -> L9c
            oW2 r6 = (defpackage.C8365oW2) r6     // Catch: java.lang.Throwable -> L9c
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r5 = android.util.Base64.encodeToString(r6, r5)     // Catch: java.lang.Throwable -> L9c
            r0.putString(r4, r5)     // Catch: java.lang.Throwable -> L9c
            goto L2e
        L93:
            r0.apply()     // Catch: java.lang.Throwable -> L9c
            if (r1 == 0) goto L9b
            r1.close()
        L9b:
            return
        L9c:
            r0 = move-exception
            if (r1 == 0) goto La2
            r1.close()     // Catch: java.lang.Throwable -> La2
        La2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12268zt.f():void");
    }
}
