package aapgsuez.net.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class ChapterInfo extends AppCompatActivity {
    Button next3;
    EditText ID;
    String id = "", position_str, coordination_str = "", committee_str = "";
    private ImageView reg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_info);

        reg3 = (ImageView) findViewById(R.id.reg3_img);
        Picasso.get().load(R.drawable.r3).fit()
                .into(reg3);
        final Spinner Position = (Spinner) findViewById(R.id.position);
        final Spinner coordination = (Spinner) findViewById(R.id.coordination);
        final Spinner committee = (Spinner) findViewById(R.id.committee);
        next3 = (Button) findViewById(R.id.next3);
        ID = (EditText) findViewById(R.id.id);

        ArrayAdapter PositionAdapter = ArrayAdapter.createFromResource(this, R.array.position,
                android.R.layout.simple_spinner_dropdown_item);
        Position.setAdapter(PositionAdapter);

        Position.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (Position.getSelectedItem().toString().equals("Choose your Position....")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.VISIBLE);

                } else if (Position.getSelectedItem().toString().equals("Member")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.VISIBLE);
                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.coordination, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);


                } else if (Position.getSelectedItem().toString().equals("Head Assistant")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.VISIBLE);
                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.coordination, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);


                } else if (Position.getSelectedItem().toString().equals("Ex Head Assistant")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.VISIBLE);
                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.coordination, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);


                } else if (Position.getSelectedItem().toString().equals("Head")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.VISIBLE);
                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.coordination, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);


                } else if (Position.getSelectedItem().toString().equals("Ex Head")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.VISIBLE);
                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.coordination, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);


                } else if (Position.getSelectedItem().toString().equals("Officer")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.GONE);
                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.coordination, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                    ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    committee.setAdapter(committeeAdapter);


                } else if (Position.getSelectedItem().toString().equals("Ex Officer")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.GONE);
                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.coordination, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                    ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    committee.setAdapter(committeeAdapter);

                } else if (Position.getSelectedItem().toString().equals("Vice-officer")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.GONE);

                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.coordination, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                    ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    committee.setAdapter(committeeAdapter);


                } else if (Position.getSelectedItem().toString().equals("President")) {
                    coordination.setVisibility(View.GONE);
                    committee.setVisibility(View.GONE);

                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                    ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    committee.setAdapter(committeeAdapter);


                } else if (Position.getSelectedItem().toString().equals("Ex President")) {
                    coordination.setVisibility(View.GONE);
                    committee.setVisibility(View.GONE);

                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                    ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    committee.setAdapter(committeeAdapter);


                } else if (Position.getSelectedItem().toString().equals("Vice-president")) {
                    coordination.setVisibility(View.GONE);
                    committee.setVisibility(View.GONE);

                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                    ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    committee.setAdapter(committeeAdapter);


                } else if (Position.getSelectedItem().toString().equals("Ex Vice-president")) {
                    coordination.setVisibility(View.GONE);
                    committee.setVisibility(View.GONE);

                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                    ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    committee.setAdapter(committeeAdapter);


                } else if (Position.getSelectedItem().toString().equals("Programs Coordinator")) {
                    coordination.setVisibility(View.GONE);
                    committee.setVisibility(View.GONE);

                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                    ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    committee.setAdapter(committeeAdapter);


                } else if (Position.getSelectedItem().toString().equals("Trainer")) {
                    coordination.setVisibility(View.GONE);
                    committee.setVisibility(View.GONE);

                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                    ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    committee.setAdapter(committeeAdapter);


                } else if (Position.getSelectedItem().toString().equals("Ex Trainer")) {
                    coordination.setVisibility(View.GONE);
                    committee.setVisibility(View.GONE);

                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                    ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    committee.setAdapter(committeeAdapter);


                } else if (Position.getSelectedItem().toString().equals("Editor-In-Chief")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.VISIBLE);
                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.coordination, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                } else if (Position.getSelectedItem().toString().equals("Ex Editor-In-Chief")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.VISIBLE);
                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.coordination, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                } else if (Position.getSelectedItem().toString().equals("Secretary Deputy")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.GONE);
                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.coordinationsec, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                    ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    committee.setAdapter(committeeAdapter);

                } else if (Position.getSelectedItem().toString().equals("Ex Secretary Deputy")) {
                    coordination.setVisibility(View.VISIBLE);
                    committee.setVisibility(View.GONE);
                    ArrayAdapter coordinationAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.coordinationsec, android.R.layout.simple_spinner_dropdown_item);
                    coordination.setAdapter(coordinationAdapter);

                    ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                            R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                    committee.setAdapter(committeeAdapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        coordination.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if (coordination.getSelectedItem().toString().equals("Choose your coordination...")) {


                        } else if (coordination.getSelectedItem().toString().equals("Marketing Coordination")) {
                            if (Position.getSelectedItem().toString().equals("Officer") ||
                                    Position.getSelectedItem().toString().equals("Ex Officer") ||
                                    Position.getSelectedItem().toString().equals("Vice-officer")) {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            } else {

                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.marketing, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);

                            }
                        } else if (coordination.getSelectedItem().toString().equals("Executive Coordination")) {
                            if (Position.getSelectedItem().toString().equals("Officer") ||
                                    Position.getSelectedItem().toString().equals("Ex Officer") ||
                                    Position.getSelectedItem().toString().equals("Vice-officer")) {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            } else {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.executive, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            }


                        } else if (coordination.getSelectedItem().toString().equals("HR Coordination")) {
                            if (Position.getSelectedItem().toString().equals("Officer") ||
                                    Position.getSelectedItem().toString().equals("Ex Officer") ||
                                    Position.getSelectedItem().toString().equals("Vice-officer")) {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            } else {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.HR, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            }


                        } else if (coordination.getSelectedItem().toString().equals("Academy Coordination")) {
                            if (Position.getSelectedItem().toString().equals("Officer") ||
                                    Position.getSelectedItem().toString().equals("Ex Officer") ||
                                    Position.getSelectedItem().toString().equals("Vice-officer")) {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            } else {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.academy, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            }


                        } else if (coordination.getSelectedItem().toString().equals("Secretary Coordination")) {
                            if (Position.getSelectedItem().toString().equals("Officer") ||
                                    Position.getSelectedItem().toString().equals("Ex Officer") ||
                                    Position.getSelectedItem().toString().equals("Vice-officer") ||
                                    Position.getSelectedItem().toString().equals("Secretary Deputy") ||
                                    Position.getSelectedItem().toString().equals("Ex Secretary Deputy")) {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            } else {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.secretary, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            }


                        } else if (coordination.getSelectedItem().toString().equals("Treasury Coordination")) {
                            if (Position.getSelectedItem().toString().equals("Officer") ||
                                    Position.getSelectedItem().toString().equals("Ex Officer") ||
                                    Position.getSelectedItem().toString().equals("Vice-officer")) {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            } else {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.treasury, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            }


                        } else if (coordination.getSelectedItem().toString().equals("Other")) {
                            if (Position.getSelectedItem().toString().equals("Officer") ||
                                    Position.getSelectedItem().toString().equals("Ex Officer") ||
                                    Position.getSelectedItem().toString().equals("Vice-officer")) {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.empty, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            } else {
                                ArrayAdapter committeeAdapter = ArrayAdapter.createFromResource(ChapterInfo.this,
                                        R.array.other_ccordination, android.R.layout.simple_spinner_dropdown_item);
                                committee.setAdapter(committeeAdapter);
                            }
                        }


                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });


        next3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                id = ID.getText().toString().trim();

                if (Position.getSelectedItem() != null) {
                    position_str = Position.getSelectedItem().toString().trim();
                }
                if (coordination.getSelectedItem() != null) {
                    coordination_str = coordination.getSelectedItem().toString().trim();
                }
                if (committee.getSelectedItem() != null) {
                    committee_str = committee.getSelectedItem().toString().trim();
                }
                if (id.equals("")) {
                    Toast.makeText(ChapterInfo.this, "Enter Your ID", Toast.LENGTH_SHORT).show();


                } else if (committee_str.equals("Choose your committee...")) {
                    Toast.makeText(ChapterInfo.this, "Choose your committee...", Toast.LENGTH_SHORT).show();


                } else if (coordination_str.equals("Choose your coordination...")) {
                    Toast.makeText(ChapterInfo.this, "Choose your coordination...", Toast.LENGTH_SHORT).show();


                } else if (position_str.equals("Choose your Position....")) {
                    Toast.makeText(ChapterInfo.this, "Choose your Position....", Toast.LENGTH_SHORT).show();


                } else {

                }
            }
        });

    }

}