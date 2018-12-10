new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(Logo.this, Login.class);
                Logo.this.startActivity(mainIntent);               
                Logo.this.finish();
            }
        }, 3000);
