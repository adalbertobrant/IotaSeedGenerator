token_library = "ABCDEFGHIJKLMNOPQRSTUVXYWZ9".chars

if ARGV.size != 1
  puts "key_size size was expected"
  exit 1
end

key_size = ARGV[0].to_i

if key_size < 31 or key_size > 81
    puts "key_size must be grater than 30, lower than 82"
    exit 2
end

key = key_size.times.map{token_library.sample}.join

puts key

f = File.open("iota_key.txt", "w")
f.write(key)
f.close
